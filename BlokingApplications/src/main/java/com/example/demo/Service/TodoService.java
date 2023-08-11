package com.example.demo.Service;

import java.util.List;

import com.example.demo.Bean.Todos;
import com.example.demo.ExcptionHandler.TodosNotFoundException;


public interface TodoService {

	public Todos  addTodos(Todos todos);
	 public Boolean deleteTodos(Long id) throws TodosNotFoundException;
	public Todos updateTodosStatus(Long id, int i);
	public Todos updateTodo(Todos todo, Long id);
	public Todos getTodosById(Long id) throws Exception;
	public List<Todos> getAllTodos(Todos todos);

}
