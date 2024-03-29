package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.accenture.lkm.dto.TaskBean;

@Repository
public class TaskDaoImpl implements TaskDao {
	
	private static Map<Integer, TaskBean> tasks = new HashMap<>();
	private static int lastId;
	static {
		tasks.put(1001, new TaskBean(1001,"Schedule daily Status Calls","Completed"));
		tasks.put(1002, new TaskBean(1002,"Update priorities","In progress"));
		tasks.put(1003, new TaskBean(1003,"Set up call with clients","New"));
		tasks.put(1004, new TaskBean(1004,"Byte sized session demo","In progress"));
		tasks.put(1005, new TaskBean(1005,"Update activity tracker","Completed"));
		lastId= 1005;
	}
	
	@Override
	public TaskBean getTask(int taskId) {
		// TODO Auto-generated method stub
		return tasks.get(taskId);
	}
	
	@Override
	public TaskBean addTask(TaskBean task) {
		task.setId(++lastId);
		tasks.put(task.getId(), task);
		return task;
	}
	
	@Override
	public TaskBean deleteTask(int taskId) {	
		return tasks.remove(taskId);
	}
	
	@Override
	public List<TaskBean> getAllTasks(){
		
		return new ArrayList(tasks.values());
	}
}
