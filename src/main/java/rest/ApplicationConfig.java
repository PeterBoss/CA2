package rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Peter
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(rest.CompanyResource.class);
        resources.add(rest.PersonResource.class);
    }
    
}
