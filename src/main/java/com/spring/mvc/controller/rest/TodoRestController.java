package com.spring.mvc.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.model.Todo;
import com.spring.mvc.service.TodoService;

@RestController

public class TodoRestController {
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value ="/todos")
	public List<Todo> reterieveAllTodos(){
		return todoService.retrieveTodos("Ahmed");
	}
	
	@RequestMapping(value = "/todos/{id}")
	public Todo retrieveById(@PathVariable int id) {
		return todoService.retrieveTodo(id);
	}
}
