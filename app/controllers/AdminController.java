package controllers;

import io.sentry.Sentry;
import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class AdminController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        Sentry.init("https://4dff8390f1a2491cbfd09e3734322b21@o312835.ingest.sentry.io/5275496");
        Sentry.capture("AdminController - index capture");
        this.logWithStaticAPI();

        return ok(views.html.index.render());
    }

    public Result login() {
        return ok(views.html.login.render());
    }

    /**
     * An example method that throws an exception.
     */
    void unsafeMethod() {
        throw new UnsupportedOperationException("You shouldn't call this!!!");
    }

    /**
     * Examples using the (recommended) static API.
     */
    void logWithStaticAPI() {
        try {
            unsafeMethod();
        } catch (Exception e) {
            Sentry.capture(e);
        }
    }

}
