package com.ams.todo.repositories;

import java.util.List;

import com.ams.todo.pojo.Task;

public interface TasksRepository {
	/**
	 * Liste de toutes les taches
	 * 
	 * @return liste de taches
	 */
	public List<Task> getAllTasks();
	
	/**
	 * Nouvelle tache a effectuer
	 * @param task tache a effectuer
	 * @return identifiant de la tache 
	 */
	public String newTask(Task task);
}
