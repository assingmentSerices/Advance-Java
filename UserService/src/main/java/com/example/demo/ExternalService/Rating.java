package com.example.demo.ExternalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="RATINGSERVICE")
public interface Rating {
	
	
	@PostMapping("/rating/save")
	public Rating createRating(Rating values);

}
