package com.adda.dollop.Controller;

import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
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

import com.adda.dollop.Bean.Product;
import com.adda.dollop.Bean.User;
import com.adda.dollop.Service.ProductService;

@RequestMapping("/product")
@Controller
public class ProductController {
@Autowired
 private ProductService productService;

@PostMapping("/findall")
public ResponseEntity<List>findAll(){
	
	ResponseEntity<List> responce= new ResponseEntity<List>((List) this.productService.findAll(),HttpStatus.OK);
return  responce;
}


@PostMapping("/save")
public ResponseEntity<Product> addProduct(@RequestBody Product product){
	ResponseEntity<Product> response = new ResponseEntity<Product>(this.productService.createEmployee(product),HttpStatus.CREATED);
  return response;
}

@PutMapping("/update")
public ResponseEntity<Product>updateProduct(@RequestBody Product product){
ResponseEntity<Product>responce = new ResponseEntity<Product>(this.productService.updateEmployee(product),HttpStatus.OK);
return responce;

}

@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteProduct(@PathVariable("id") Integer id){
	
this.productService.deleteEmployee(id);
System.out.println(id);	
ResponseEntity<String> response = new ResponseEntity<String>("Deleted "+id,HttpStatus.OK);
return response;
}

	
}
