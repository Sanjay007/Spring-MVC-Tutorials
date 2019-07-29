package com.frugalis.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.frugalis.model.Todo;

@Service
public class TodoService {
	private static List<Todo> todoList = new ArrayList<Todo>();
	private static int todoCount = 3;

	static {
		todoList.add(new Todo(1, "FrugalisMinds", "Eat Food", new Date(),
				false));
		todoList.add(new Todo(2, "FrugalisMinds", "Go Gym at 5", new Date(), false));
		todoList.add(new Todo(3, "FrugalisMinds", "Update My Friend", new Date(),
				false));
	}

	public List<Todo> getAllToDo(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todoList) {
			if (todo.getUser().equals(user))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}

	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todoList.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}

	public void deleteTodo(int id) {
		for (Todo todo : todoList) {
			if (todo.getId() == id)
				todoList.remove(todo);
		}
	}
}