package ir.digixo.jersey.config;

import ir.digixo.jersey.Controller.MyController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigJersey extends ResourceConfig {

    public ConfigJersey() {
        register(MyController.class);
    }
}
