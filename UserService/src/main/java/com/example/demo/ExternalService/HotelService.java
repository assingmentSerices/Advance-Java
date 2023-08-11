package com.example.demo.ExternalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.Hotel;

@FeignClient(name="HOTELSERVICE")
public interface HotelService {
	@GetMapping("/hotel/{id}")
	ResponseEntity<Hotel> getHotel(@PathVariable("id") String hotelId);
}
