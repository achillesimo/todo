package com.ams.todo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

//@ApiModel(description="Tache")
public class Task {
	//@ApiModelProperty(value="Identidiant de la tache")
	private String id;
	
	//@ApiModelProperty(value="Nom de la tache")
	private String name;
	
	//@ApiModelProperty(value="Description de la tache")
	private String description;
	
	//@ApiModelProperty(value = "Date Maximle pour la realisation de la tache")
	private Date deadLine;
	
	public Task(){
		
	}

	/**
	 * @param id : Identifiant de la tache
	 * @param name : Nom de la tache
	 * @param description : Description de la tache
	 * @param deadLine : Date de fin de la tache
	 */
	public Task(String id, String name, String description, Date deadLine) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.deadLine = deadLine;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
