package com.clinkast.rest;

import com.clinkast.beans.Employee;
import com.clinkast.beans.EmployeeDetails;
import com.clinkast.dao.InMemoryDataBaseManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/")
public class EmployeeRessource {

    @GET
    @Path("/employees")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStartingPage() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<Long, Employee> employee = InMemoryDataBaseManager.getEmployees();
        String output = objectMapper.writeValueAsString(employee.values());
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/employee/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStartingPage(@PathParam("id") Long id)  throws JsonProcessingException{
        Employee employee = InMemoryDataBaseManager.getEmployee(id);
        ObjectMapper objectMapper = new ObjectMapper();
        String output = objectMapper.writeValueAsString(employee);
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/employee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addEmployee(EmployeeDetails employeeDetails){
        Employee employee = InMemoryDataBaseManager.addEmployee(employeeDetails);
        return Response.status(200).entity(employee).build();
    }

    @PUT
    @Path("/employee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateEmployee(Employee employee){
        Employee newEmployee = InMemoryDataBaseManager.editEmployee(employee);
        return Response.status(200).entity(newEmployee).build();
    }

    @DELETE
    @Path("/employee/{id}")
    public Response deleteEmployee(@PathParam("id") Long id){
        InMemoryDataBaseManager.deleteEmployee(id);
        return Response.status(200).entity("{}").build();
    }
}
