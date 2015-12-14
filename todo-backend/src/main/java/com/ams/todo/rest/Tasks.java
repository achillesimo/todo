package com.ams.todo.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.ams.todo.pojo.Task;

@Path("tasks")
@Api(value = "tasks", consumes  = MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Tasks {
	
	@GET
	@Path("/all")
	@ApiOperation(value = "Recupere toutes les teches",
		httpMethod = "GET", 
	    response = Task.class,
	    responseContainer = "List")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces( MediaType.APPLICATION_JSON )
	public Response getAllTasks(){
		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < 3; i++) {
			tasks.add(new Task(String.valueOf(i), "name"," description", new Date()));
		}
		GenericEntity<List<Task>> entity = new GenericEntity<List<Task>>(tasks) {};
		
		return Response.status(Status.OK).entity(entity).build();
	}
}
