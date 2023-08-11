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

import com.adda.dollop.Bean.GroupProduct;
import com.adda.dollop.Bean.User;
import com.adda.dollop.Service.GroupProductService;
@Controller
@RequestMapping("/groupproduct")
public class GroupProductController {
@Autowired
	private GroupProductService groupproductservice;
@PostMapping("/save")
public ResponseEntity<GroupProduct> addUser(@RequestBody GroupProduct groupproduct){
	ResponseEntity<GroupProduct> response = new ResponseEntity<GroupProduct>(this.groupproductservice.createGroupProduct(groupproduct),HttpStatus.CREATED);
  return response;
}

@PutMapping("/update")
public ResponseEntity<GroupProduct>updateUser(@RequestBody GroupProduct groupproduct){
ResponseEntity<GroupProduct>responce = new ResponseEntity<GroupProduct>(this.groupproductservice.updateGroupProduct(groupproduct),HttpStatus.OK);
return responce;

}
@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id){

this.groupproductservice.deleteGroupProduct(id);
ResponseEntity<String> response = new ResponseEntity<String>("Deleted "+id,HttpStatus.OK);
return response;
}
	
}
