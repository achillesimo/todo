package com.ams.todo.logique.impl;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.ams.todo.bouchons.TasksValues;
import com.ams.todo.pojo.Task;
import com.ams.todo.repositories.TasksRepository;

@RunWith(MockitoJUnitRunner.class)
public class TasksLogiqueImplTest {
	
	@InjectMocks
	TasksLogiqueImpl taskLogique;
	
	@Mock
	TasksRepository tasksRepository;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAllTasks() {

		when(tasksRepository.getAllTasks()).thenReturn(TasksValues.INSTANCE.getTasks());
		
		List<Task> tasks1 = taskLogique.getAllTasks();
		Assert.assertEquals(tasks1.size(), 3);
		
		verify(tasksRepository).getAllTasks();
	}
}
