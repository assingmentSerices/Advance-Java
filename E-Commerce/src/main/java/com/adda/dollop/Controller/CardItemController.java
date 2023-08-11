package com.adda.dollop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adda.dollop.Bean.CartItem;
import com.adda.dollop.Service.CartItemService;
@Controller
@RequestMapping("/cartitem")
public class CardItemController {
@Autowired
	private CartItemService cartItemService;

@PostMapping("/save")
public ResponseEntity<CartItem> addCartItem(@RequestBody CartItem cartitem){
	ResponseEntity<CartItem>response=new ResponseEntity<CartItem>(this.cartItemService.createCartItem(cartitem),HttpStatus.CREATED);
	return response;
}
@PutMapping("update")
public ResponseEntity<CartItem>updateCartItem(@RequestBody CartItem cartitem){
	ResponseEntity<CartItem> responce=new  ResponseEntity<CartItem>(this.cartItemService.updateCartItem(cartitem),HttpStatus.OK);
	  return responce;
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteCartItem(@PathVariable("id") Integer id){
	
	this.cartItemService.deleteCartItem(id);
	ResponseEntity<String> response = new ResponseEntity<String>("Deleted "+id,HttpStatus.OK);
	return response;
}




}
