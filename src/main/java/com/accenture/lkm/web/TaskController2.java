package com.accenture.lkm.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.lkm.dto.TaskBean;
import com.accenture.lkm.service.TaskServiceImpl;

@RestController
public class TaskController2 {

	@Autowired
	private TaskServiceImpl taskServiceImpl;

	@RequestMapping(value = "task/getDetails2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TaskBean>> getTaskDetails() {
		List<TaskBean> listTask = new ArrayList<TaskBean>(taskServiceImpl.getAllTasks());

		return new ResponseEntity<List<TaskBean>>(listTask, HttpStatus.OK);
	}

}
