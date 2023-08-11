package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Hotel;

public interface HotelService {

	Hotel  create(Hotel hotel);
	List<Hotel> getAll();
	Hotel get(String id);
}
