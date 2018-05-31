package com.clinkast.config;

import com.clinkast.rest.EmployeeRessource;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig  extends ResourceConfig {

    private void ApplicationInit(){
        // Resources.
        packages(EmployeeRessource.class.getPackage().getName());
        // Register CORS filter.
        register(com.clinkast.utils.CORSFilter.class);
    }

    public ApplicationConfig() {
        ApplicationInit();
    }

}