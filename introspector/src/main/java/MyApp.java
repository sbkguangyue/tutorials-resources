import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class MyApp extends Application {

    /**
     * The name will be used as the connector's name
     */
    @Override
    public String getName() {
        return "Contacts API";
    }

    @Override
    public Restlet createInboundRoot() {
        final Router router = new Router();

        router.attach("/ping", PingResource.class);
        router.attach("/contacts", ContactsResource.class);

        return router;
    }
}
