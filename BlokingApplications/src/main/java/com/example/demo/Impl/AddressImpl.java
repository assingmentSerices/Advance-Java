package com.example.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.AddressRepo;
import com.example.demo.Service.AddressService;

@Service
public class AddressImpl implements AddressService {
@Autowired
	private AddressRepo addressrepo;
	
	

}
