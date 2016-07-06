package br.com.thiagogarciaalves.app;

import br.com.thiagogarciaalves.rest.MessageRestService;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class RESTfulApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public RESTfulApplication() {
        singletons.add(new MessageRestService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
