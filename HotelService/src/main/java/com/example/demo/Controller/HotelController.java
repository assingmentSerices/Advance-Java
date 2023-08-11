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

import com.example.demo.Entity.Hotel;
import com.example.demo.Service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
@Autowired
private HotelService hotelservice;
@PostMapping("/create")
public ResponseEntity<Hotel>  createHotel(@RequestBody Hotel hotel){
	return ResponseEntity.status(HttpStatus.CREATED).body(hotelservice.create(hotel));
}
@GetMapping("/{id}")
public ResponseEntity<Hotel> getById( @PathVariable  String  id){
	return ResponseEntity.status(HttpStatus.OK).body(hotelservice.get(id));

}
@GetMapping("/all")
public ResponseEntity<List<Hotel>> getAll(){
	return ResponseEntity.ok (hotelservice.getAll());
}

}
