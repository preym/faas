package controllers;

import models.DatabaseHelper;
import models.Feedback;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.ehc;
import views.html.index;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ehc
 * Date: 31/10/13
 * Time: 9:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class EhcController extends Controller {

    private static Feedback feedback = new Feedback();


    public static Result index() {

//        final Set<Map.Entry<String, String[]>> entries = request().queryString().entrySet();
//        for (Map.Entry<String, String[]> entry : entries) {
//            final String key = entry.getKey();
//            final String value = Arrays.toString(entry.getValue());
//            Logger.debug(key + " " + value);
//        }
        populateFields();
        DatabaseHelper.insertRecord(feedback);
        DatabaseHelper.getRecords();
        return ok(ehc.render());
    }

    private static void populateFields() {
        feedback.setName(request().getQueryString("name"));
        feedback.setEmail(request().getQueryString("email"));
        feedback.setPhone(Long.parseLong(request().getQueryString("phone")));
        feedback.setFeedback_type(request().getQueryString("feedback_type"));
        feedback.setMessage(request().getQueryString("message"));
    }

}


