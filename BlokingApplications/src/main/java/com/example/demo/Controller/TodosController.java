package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Todos;
import com.example.demo.Bean.User;
import com.example.demo.ExcptionHandler.TodosNotFoundException;
import com.example.demo.Service.TodoService;

@RequestMapping("/todos")
@RestController
public class TodosController {
@Autowired
private TodoService todosservice;

@PostMapping("save")
public ResponseEntity<Todos> addTodo(@RequestBody Todos todo){
	ResponseEntity<Todos> response = new ResponseEntity<Todos>(this.todosservice.addTodos(todo),HttpStatus.CREATED);
	return response;
}

@GetMapping("")
public ResponseEntity<List<Todos>> getAllTodosOfLoggedInUser(Todos todos){
	User user = new User();
	user.setId(1L);
	ResponseEntity<List<Todos>> response = new ResponseEntity<List<Todos>>(this.todosservice.getAllTodos(todos),HttpStatus.OK);
	return response;
}

@GetMapping("/{id}")
public ResponseEntity<Todos> getTodoById(@PathVariable Long id) throws Exception{
	ResponseEntity<Todos> response = new ResponseEntity<Todos>(this.todosservice.getTodosById(id),HttpStatus.OK);
	return response;
}

@PutMapping("/{id}")
public ResponseEntity<Todos> updateTodo(@PathVariable Long id,@RequestBody Todos todo){
	ResponseEntity<Todos> response = new ResponseEntity<Todos>(this.todosservice.updateTodo(todo, id),HttpStatus.OK);
	return response;
}

@DeleteMapping("/{id}")
public ResponseEntity<String> addTodo(@PathVariable Long id) throws TodosNotFoundException {
	ResponseEntity<String> response = new ResponseEntity<String>(this.todosservice.deleteTodos(id)+ " Todo Deleted Id : "+id,HttpStatus.CREATED);
	return response;
}

@PutMapping("/{id}/complete")
public ResponseEntity<Todos> updateTodoComplete(@PathVariable Long id){
	ResponseEntity<Todos> response = new ResponseEntity<Todos>(this.todosservice.updateTodosStatus(id, 1),HttpStatus.OK);
	return response;
}

@PutMapping("/{id}/unCom")
public ResponseEntity<Todos> updateTodoUncomplete(@PathVariable Long id){
	ResponseEntity<Todos> response = new ResponseEntity<Todos>(this.todosservice.updateTodosStatus(id, 0),HttpStatus.OK);
	return response;
}

}
