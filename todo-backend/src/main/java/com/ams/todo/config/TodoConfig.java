package com.ams.todo.config;

import java.util.HashSet;
import java.util.Set;

import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.ams.todo.contantes.TodoConstantes;
import com.ams.todo.rest.Tasks;

@ApplicationPath(TodoConstantes.PATH_API)
public class TodoConfig extends Application{
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		this.referenccerRessourcesRest(classes);
		this.referenccerRessourcesSwagger(classes);
		return classes;
	}

	private void referenccerRessourcesSwagger(Set<Class<?>> classes) {
		classes.add(ApiListingResource.class);
		classes.add(SwaggerSerializers.class);
		
	}

	private void referenccerRessourcesRest(Set<Class<?>> classes) {
		classes.add(Tasks.class);
		
	}
	
}
