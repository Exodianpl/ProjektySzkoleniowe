package hello;

import java.time.LocalTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class Hello {

    @GET
    public String hello() {
   	 return "Hello z godziny " + LocalTime.now();
    }
    
    @GET
    @Path("/dodaj")
    // /hello/dodaj?arg1=13&arg2=17
    public long dodaj(@QueryParam("arg1") long a, @QueryParam("arg2") long b) {
   	 return a + b;
    }
    
    @GET
    @Path("/oblicz/{arg1}+{arg2}")
    // /hello/oblicz/123+456
    public long plus(@PathParam("arg1") long a, @PathParam("arg2") long b) {
   	 return a + b;
    }
    
    
    @GET
    @Path("/oblicz/{arg1}*{arg2}")
    // /hello/oblicz/123*456
    public long pomnoz(@PathParam("arg1") long a, @PathParam("arg2") long b) {
   	 return a * b;
    }
}






