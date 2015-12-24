package com.ams.todo.pojo;

import io.swagger.annotations.ApiModel;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@ApiModel(description="Tache")
@Entity(value="tache")
public class Task {
	@Id
	private ObjectId id;
	
	private String name;
	
	private String description;
	
	private Date deadLine;
	
	public Task(){
		
	}

	/**
	 * @param id : Identifiant de la tache
	 * @param name : Nom de la tache
	 * @param description : Description de la tache
	 * @param deadLine : Date de fin de la tache
	 */
	public Task(ObjectId id, String name, String description, Date deadLine) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.deadLine = deadLine;
	}

	public String getId() {
		return id.toHexString();
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
		
}
