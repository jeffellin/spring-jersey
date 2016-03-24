package com.example.jersey;

import com.example.HelloWorldResource;
import javafx.util.converter.LocalDateTimeStringConverter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by jellin on 3/24/16.
 */
@Component
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        registerEndpoints();
    }

    private void registerEndpoints() {
        register(HelloWorldResource.class);
    }
}
