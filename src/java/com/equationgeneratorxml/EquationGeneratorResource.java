package com.equationgeneratorxml;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.bind.JAXB;
import java.io.StringWriter;
import java.util.Random;

/**
 * REST Web Service
 *
 * @author LordTusha Forbes
 */

@Path("equation")
public class EquationGeneratorResource {
    
    private static Random randomObject = new Random();

    @GET
    @Path("{operation}/{level}")
    @Produces("application/xml")
    public String getXml(@PathParam("operation") String operation,
                         @PathParam("level") int level) {
        
        int minimum = (int) Math.pow(10, level - 1);
        int maximum = (int) Math.pow(10, level);
        
        int second = randomObject.nextInt(maximum - minimum) + minimum;
        int first = randomObject.nextInt(maximum - minimum) + minimum;
        
        Equation equation = new Equation(first, second, operation);
        StringWriter writer = new StringWriter();
        JAXB.marshal(equation, writer);
        
        return writer.toString();
    }//end getXml
}//end EquationGeneratorResource
