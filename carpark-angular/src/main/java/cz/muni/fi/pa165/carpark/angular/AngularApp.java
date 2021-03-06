package cz.muni.fi.pa165.carpark.angular;

import cz.muni.fi.pa165.carpark.rest.configuration.RestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * Created by karelfajkus on 14/12/2016.
 */
@Import(RestConfiguration.class)
@EnableAutoConfiguration
public class AngularApp {
    public static void main(String[] args) {
        SpringApplication.run(AngularApp.class, args);
    }

}
