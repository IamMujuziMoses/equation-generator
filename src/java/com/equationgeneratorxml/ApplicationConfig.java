
package com.equationgeneratorxml;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * @author LordTusha Forbes
 */

@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }//end getClasses
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        
        resources.add(com.equationgeneratorxml.EquationGeneratorResource.class);
    }//endaddRestResourceClasses
    
}//end ApplicationConfig
