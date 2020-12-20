package com.equationgeneratorjson;

import com.google.gson.Gson;
import java.util.Random;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author LordTusha Forbes
 */

@Path("equation")
public class EquationGeneratorJSONResource {
    
    private static Random randomObject = new Random();

    @GET
    @Path("{operation}/{level}")
    @Produces("application/json")
    public String getJson(@PathParam("operation") String operation,
                         @PathParam("level") int level) {
        
        int minimum = (int) Math.pow(10, level - 1);
        int maximum = (int) Math.pow(10, level);
        
        int second = randomObject.nextInt(maximum - minimum) + minimum;
        int first = randomObject.nextInt(maximum - minimum) + minimum;
        
        Equation equation = new Equation(first, second, operation);
        return new Gson().toJson(equation);
    }//end getJson
}//end EquationGeneratorJSONResource
