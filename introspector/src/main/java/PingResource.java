import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class PingResource extends ServerResource {
    @Get
    public String ping() {
        return "pong";
    }
}
