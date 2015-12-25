package com.ams.todo.rest;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.print.DocFlavor.STRING;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ams.todo.logique.TasksLogique;
import com.ams.todo.pojo.Task;

@Component
@Path("tasks")
@Api(value = "tasks", consumes  = MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Tasks {

	
	Logger logger = LoggerFactory.getLogger(Tasks.class);
	
	@Autowired
	TasksLogique tasksLogique;
	
	@GET
	@Path("/all")
	@ApiOperation(value = "Recupere toutes les taches",
		httpMethod = "GET", 
	    response = Task.class,
	    responseContainer = "List")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces( MediaType.APPLICATION_JSON )
	public Response getAllTasks(){
		
		logger.debug("Tous les utilisateurs");
		// Liste des taches depuis la partie logique
		List<Task> tasks = tasksLogique.getAllTasks();
		
		GenericEntity<List<Task>> entity = new GenericEntity<List<Task>>(tasks) {};
		
		return Response.status(Status.OK).entity(entity).build();
	}
	
	
	@POST
	@Path("/new")
	@ApiOperation(value = "Nouvelle tache",
		httpMethod = "POST", 
	    response = String.class,
	    responseContainer = "String")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces( MediaType.APPLICATION_JSON )
	public Response newTask(Task task){
		
		// Liste des taches depuis la partie logique
		String taskId = tasksLogique.newTask(task);
		
		return Response.status(Status.OK).build();
	}
}
