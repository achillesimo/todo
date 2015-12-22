package com.ams.todo.logique;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ams.todo.pojo.Task;


public interface TasksLogique {
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
