package com.adda.dollop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adda.dollop.Bean.Cart;

import com.adda.dollop.Service.CartService;

@RequestMapping("/cart")
@Controller
public class CartController {
@Autowired
	private CartService cartservice;

@PostMapping("/save")
public ResponseEntity<Cart> addCart(@RequestBody Cart cart){
	ResponseEntity<Cart> response = new ResponseEntity<Cart>(this.cartservice.createCart(cart),HttpStatus.CREATED);
  return response;
}

@PutMapping("/update")
public ResponseEntity<Cart> updateCart(@RequestBody Cart cart){
	ResponseEntity<Cart> response = new ResponseEntity<Cart>(this.cartservice.updateCart(cart),HttpStatus.OK);
  return response;
}
@DeleteMapping("/delete/{id}")
   
public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id){
	
	this.cartservice.deleteCart(id);
	ResponseEntity<String> response = new ResponseEntity<String>("Deleted "+id,HttpStatus.OK);
	return response;
}
	
}
