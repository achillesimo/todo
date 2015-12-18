package com.ams.todo.rest;

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


import com.ams.todo.logique.TaskLogique;
import com.ams.todo.pojo.Task;

@Path("tasks")
@Api(value = "tasks", consumes  = MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Tasks {

	TaskLogique tasksLogique;
	
	@GET
	@Path("/all")
	@ApiOperation(value = "Recupere toutes les teches",
		httpMethod = "GET", 
	    response = Task.class,
	    responseContainer = "List")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces( MediaType.APPLICATION_JSON )
	public Response getAllTasks(){
		
		// Liste des taches depuis la partie logique
		List<Task> tasks = tasksLogique.getAllTasks();
		
		GenericEntity<List<Task>> entity = new GenericEntity<List<Task>>(tasks) {};
		
		return Response.status(Status.OK).entity(entity).build();
	}
}
