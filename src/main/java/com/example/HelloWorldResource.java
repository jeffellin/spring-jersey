package com.example;




        import javax.ws.rs.GET;
        import javax.ws.rs.Path;
        import javax.ws.rs.Produces;
        import javax.ws.rs.QueryParam;
        import javax.ws.rs.core.MediaType;

        import com.example.model.Saying;
        import jersey.repackaged.com.google.common.base.Optional;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.stereotype.Service;

        import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
@Service
public class HelloWorldResource {

    @Value("${template}")
    private String template;
    @Value("${defaultName}")
    private String defaultName;

    private AtomicLong counter = new AtomicLong();



    @GET
    public Saying sayHello(@QueryParam(value = "name") String name) {
        final String value = String.format(template,name);
        return new Saying(counter.incrementAndGet(), value);
    }
}