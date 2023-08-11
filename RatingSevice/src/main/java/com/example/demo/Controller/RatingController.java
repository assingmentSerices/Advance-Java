package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Rating;
import com.example.demo.Service.RatingService;
@RestController

@RequestMapping("/rating")
public class RatingController {
@Autowired
private RatingService ratingservice;
	
@PostMapping("/save")
public ResponseEntity<Rating> create(@RequestBody Rating rating){
	ResponseEntity <Rating>responce= new ResponseEntity<Rating>(this.ratingservice.create(rating),HttpStatus.CREATED);
      return responce;
}
@GetMapping("/all")
public ResponseEntity<List<Rating>> getRating(){
	return ResponseEntity.ok(ratingservice.getRating());
}
@GetMapping("/getuser/{userId}")
public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable  String userId){
	return ResponseEntity.ok(ratingservice.getRatingByUserId(userId));

}
@GetMapping("/gethotel{id}")
public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
	return ResponseEntity.ok(ratingservice.getRatingByHotelId(hotelId));

}
}
