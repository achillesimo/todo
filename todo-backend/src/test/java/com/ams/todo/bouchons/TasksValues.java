package com.ams.todo.bouchons;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.ams.todo.pojo.Task;

public enum TasksValues {
	INSTANCE;
	
	public List<Task> getTasks(){
		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < 3; i++) {
			tasks.add(new Task(new ObjectId(), "name","description", new Date()));
		}
		
		return tasks;
	}
}
