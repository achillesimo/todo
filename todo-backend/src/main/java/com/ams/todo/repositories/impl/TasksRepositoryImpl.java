package com.ams.todo.repositories.impl;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ams.todo.contantes.TodoConstantes;
import com.ams.todo.pojo.Task;
import com.ams.todo.repositories.TasksRepository;
import com.ams.todo.repositories.databases.MongoDB;

@Repository(TodoConstantes.CHAINE_TASK_REPOSITORY)
public class TasksRepositoryImpl implements TasksRepository {

	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String newTask(Task task) {
		Datastore datastore = MongoDB.INSTANCE.getDatastore();
		Key<Task> savedTask = datastore.save(task);
		savedTask.getId();
		return null;
	}

}
