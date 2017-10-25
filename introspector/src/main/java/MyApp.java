/*
 * Copyright 2010-2017 Restlet S.A.S. All rights reserved.
 * Restlet is registered trademark of Restlet S.A.S.
 */

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
