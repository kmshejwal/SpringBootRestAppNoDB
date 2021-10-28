package com.accenture.lkm.dao;

import java.util.List;

import com.accenture.lkm.dto.TaskBean;

public interface TaskDao {

	public TaskBean getTask(int taskId);
	
	TaskBean addTask(TaskBean task);

	TaskBean deleteTask(int taskId);

	List<TaskBean> getAllTasks();

}