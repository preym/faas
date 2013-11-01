package controllers;


import models.DatabaseHelper;
import models.Feedback;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.ehc;
import views.html.feedback;

import java.util.ArrayList;


public class FeedbackController extends Controller {

    private static Feedback feedbackDTO = new Feedback();


    public static Result index() {

//        final Set<Map.Entry<String, String[]>> entries = request().queryString().entrySet();
//        for (Map.Entry<String, String[]> entry : entries) {
//            final String key = entry.getKey();
//            final String value = Arrays.toString(entry.getValue());
//            Logger.debug(key + " " + value);
//        }
        populateFields();
        DatabaseHelper.insertRecord(feedbackDTO);

        return ok(ehc.render());
    }

    private static void populateFields() {
        feedbackDTO.setName(request().getQueryString("name"));
        feedbackDTO.setEmail(request().getQueryString("email"));
        feedbackDTO.setPhone(Long.parseLong(request().getQueryString("phone")));
        feedbackDTO.setFeedback_type(request().getQueryString("feedback_type"));
        feedbackDTO.setMessage(request().getQueryString("message"));
    }


    public static Result get() {
        ArrayList<Feedback> list = DatabaseHelper.getRecords();
        return ok(Json.toJson(list));
    }


    public static Result form() {
        return ok(feedback.render());
    }

}


