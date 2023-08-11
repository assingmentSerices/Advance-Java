package com.example.demo.Exception;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

     public class GlobleExceptionHandler {
	
    @ExceptionHandler(ResouresNotFoundException.class)
	public ResponseEntity<Map<String,Object>> notFoundHandler(ResouresNotFoundException ex){
    	 Map map=new HashMap();
         map.put("message",ex.getMessage());
      map.put("successfylly",false);
     map.put("status",HttpStatus.NOT_FOUND);
     return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
}
}