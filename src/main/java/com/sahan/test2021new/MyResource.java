package com.sahan.test2021new;

import java.util.List;

import com.google.gson.Gson;
import com.sahan.test2021new.dao.CarDao;
import com.sahan.test2021new.model.Car;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("cars")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll() {
    	List<Car> cars = CarDao.getCars();
    	Gson gson = new Gson();
    	String jsonString = gson.toJson(cars);
        return jsonString;
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getACar() {
    	List<Car> cars = CarDao.getCars();
    	Gson gson = new Gson();
    	String jsonString = gson.toJson(cars);
        return jsonString;
    }
    
}
