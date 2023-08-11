package com.example.demo.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Hotel;
import com.example.demo.Exception.ResouresNotFoundException;
import com.example.demo.Repo.HotelRepo;
import com.example.demo.Service.HotelService;
@Service
public class HotelImpl  implements HotelService{
@Autowired
	private HotelRepo hotelrepo;
	
    @Override
	public Hotel create(Hotel hotel) {
    	String id=UUID.randomUUID().toString() ; 
    	hotel.setId(id);
		// TODO Auto-generated method stub
		return this.hotelrepo.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return this.hotelrepo.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return this.hotelrepo.findById(id).orElseThrow(() -> new  ResouresNotFoundException("hotel with given id not found"));
	}

}
