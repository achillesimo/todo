/**
 * 
 */
package com.ams.todo.logique.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ams.todo.logique.TaskLogique;
import com.ams.todo.pojo.Task;

/**
 * Class pour les taitements à effectuer sur les taches
 * @author ambougue
 *
 */

public class TaskLogiqueImpl implements TaskLogique{

	@Override
	public List<Task> getAllTasks() {
		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < 3; i++) {
			tasks.add(new Task(String.valueOf(i), "name","description", new Date()));
		}
		
		return tasks;
	}

}
