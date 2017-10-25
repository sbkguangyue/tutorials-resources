import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import java.util.List;

import static java.util.Collections.singletonList;

public class ContactsResource extends ServerResource {

    @Get
    public List<Contact> getContacts() {
        return singletonList(
                new Contact().setName("toto").setAge(11)
        );
    }

    @Post
    public Contact postContact(Contact inputContact) {
        return inputContact;
    }
}
