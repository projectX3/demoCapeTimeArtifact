package demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import demo.model.Tbllist;
import demo.model.Tbltask;

// wichtig, damit die JSON Strukturen bei Zugriff auf das REST-Service auch die
// IDs enthalten
// (werden sonst NICHT mit ausgegeben)
@Configuration
public class MyRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration {

    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Tbllist.class);
        config.exposeIdsFor(Tbltask.class);
    }
}
