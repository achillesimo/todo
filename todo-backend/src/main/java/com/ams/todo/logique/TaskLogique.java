package com.ams.todo.logique;

import java.util.List;

import com.ams.todo.pojo.Task;


public interface TaskLogique {
	/**
	 * Liste de toutes les taches
	 * 
	 * @return liste de taches
	 */
	public List<Task> getAllTasks();
}
