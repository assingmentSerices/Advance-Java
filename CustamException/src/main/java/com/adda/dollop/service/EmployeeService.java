package com.adda.dollop.service;

import org.springframework.stereotype.Component;

import com.adda.dollop.Bean.product;
import com.adda.dollop.custom.Custom;

@Component
public class EmployeeService {
 public product getoneproduct(Integer id) {
	 if(id==150) {
		 return new product(id ,"40");
	 }
		 else
			 throw new  Custom("product not  foud"+id);
	 
 }


}
