/*
 * Copyright 2010-2017 Restlet S.A.S. All rights reserved.
 * Restlet is registered trademark of Restlet S.A.S.
 */

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class PingResource extends ServerResource {
    @Get
    public String ping() {
        return "pong";
    }
}
