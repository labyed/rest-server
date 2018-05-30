package com.clinkast.rest;

import com.clinkast.beans.Employee;
import com.clinkast.dao.InMemoryDataBaseManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/")
public class RestHelloWorld {

    @GET
    @Path("/employees")
    @Produces("text/html")
    public Response getStartingPage() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<Long, Employee> employee = InMemoryDataBaseManager.getStore();
        String output = objectMapper.writeValueAsString(employee);
        return Response.status(200).entity(output).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT,OPTIONS").build();
    }

    @GET
    @Path("/employee/{id}")
    public Response getStartingPage(@PathParam("id") Long id) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.print("szrfer");
        Employee employee = InMemoryDataBaseManager.getStore().get(id);
        String output = objectMapper.writeValueAsString(employee);
        return Response.status(200).entity(employee).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT,OPTIONS").build();
    }

    @POST
    @Path("/employee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addEmployee(Employee employee){
        InMemoryDataBaseManager.addEmployee(employee);
        return Response.status(200).entity(employee).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT,OPTIONS").build();
    }

    @PUT
    @Path("/employee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateEmployee(Employee employee){
        InMemoryDataBaseManager.addEmployee(employee);
        return Response.status(200).entity(employee).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT,OPTIONS").build();
    }

    @DELETE
    @Path("/employee/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteEmployee(@PathParam("id") Long id){
        Employee employee = InMemoryDataBaseManager.deleteEmployee(id);
        return Response.status(200).entity(employee).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT,OPTIONS").build();
    }



}
