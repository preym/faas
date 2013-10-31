package models;

import play.Logger;
import play.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ehc
 * Date: 31/10/13
 * Time: 12:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class DatabaseHelper {

    public static Connection connection = DB.getConnection();

    public static void insertRecord(Feedback feedback) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Feedback VALUES(?,?,?,?,?)");
            preparedStatement.setString(1, feedback.getName());
            preparedStatement.setString(2, feedback.getEmail());
            preparedStatement.setLong(3, feedback.getPhone());
            preparedStatement.setString(4, feedback.getFeedback_type());
            preparedStatement.setString(5, feedback.getMessage());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.debug("Database Exception ");
            e.printStackTrace();
        }
    }

    public static void getRecords() {
        ArrayList feedbacks = new ArrayList<Feedback>();

        try {
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM Feedback");
            while (resultSet.next()) {
                Feedback feedback = new Feedback();
                feedback.setName(resultSet.getString(1));
                feedback.setEmail(resultSet.getString(2));
                feedback.setPhone(resultSet.getLong(3));
                feedback.setFeedback_type(resultSet.getString(4));
                feedback.setMessage(resultSet.getString(5));

                feedbacks.add(feedback);
            }

        } catch (SQLException e) {
            Logger.debug("Database Error while getting");
            e.printStackTrace();
        }
        Logger.debug("Existing data");
        Logger.debug(feedbacks.toString());
    }


}
