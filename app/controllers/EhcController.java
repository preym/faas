package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Created with IntelliJ IDEA.
 * User: ehc
 * Date: 31/10/13
 * Time: 9:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class EhcController extends Controller {


    public static Result index() {
        return ok(index.render("welcome to ehc"));
    }

}
