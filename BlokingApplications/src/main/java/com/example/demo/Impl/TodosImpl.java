package com.example.demo.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.Todos;
import com.example.demo.ExcptionHandler.TodosNotFoundException;
import com.example.demo.ExcptionHandler.UserFoundException;
import com.example.demo.Repo.TodosRepo;
import com.example.demo.Service.TodoService;


@Service
public class TodosImpl  implements TodoService{
@Autowired
private TodosRepo todosrepo;
	@Override
	public Todos addTodos(Todos todos) {
		// TODO Auto-generated method stub
		return this.todosrepo.save(todos);
	}

	@Override
	public Boolean deleteTodos(Long id) throws TodosNotFoundException {
		// TODO Auto-generated method stub
		if (this.todosrepo.existsById(id)) {
			this.todosrepo.deleteById(id);
			return true;
		}
		throw new TodosNotFoundException("Todos not Found ID : " + id);
	
	}

	@Override
	public Todos updateTodosStatus(Long id, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todos updateTodo(Todos todo, Long id) {
		// TODO Auto-generated method stub
		if(this.todosrepo.existsById(id)) {
			todo.setId(id);
			return this.todosrepo.save(todo);			
		}
		throw new UserFoundException("User Not Found id :" +id);
	
	}

	@Override
	public Todos getTodosById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Todos> todos = this.todosrepo.findById(id);
	       if(todos.isPresent())
	    	   return todos.get();
	       throw new Exception("Todo  not founf" +id);
	
	}

	@Override
	public List<Todos> getAllTodos(Todos todos) {
		// TODO Auto-generated method stub
		return this.todosrepo.findAll() ;
	}

}
