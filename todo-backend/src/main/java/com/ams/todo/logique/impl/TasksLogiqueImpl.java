/**
 * 
 */
package com.ams.todo.logique.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.todo.contantes.TodoConstantes;
import com.ams.todo.logique.TasksLogique;
import com.ams.todo.pojo.Task;
import com.ams.todo.repositories.TasksRepository;

/**
 * Class pour les taitements � effectuer sur les taches
 * @author ambougue
 *
 */

@Service(TodoConstantes.CHAINE_TASK_LOGIQUE)
public class TasksLogiqueImpl implements TasksLogique{
	
	@Autowired
	TasksRepository tasksRepository;
	
	@Override
	public List<Task> getAllTasks() {
		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < 3; i++) {
			tasks.add(new Task(new ObjectId(), "name","description", new Date()));
		}
		
		return tasks;
	}

	@Override
	public String newTask(Task task) {
		String id = tasksRepository.newTask(task);
		return id;
	}

}
