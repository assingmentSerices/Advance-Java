package com.example.demo.Impl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.Companey;
import com.example.demo.Repo.CompaneyRepo;
import com.example.demo.Service.CompaneyService;
@Service


public class CompaneyImpl implements CompaneyService {
@Autowired
private CompaneyRepo companeyrepo;
	@Override
	public Companey addCompaney(Companey companey) {
		// TODO Auto-generated method stub
		return  this.companeyrepo.save(companey);
	}

	@Override
	public Companey getCompaneyById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Companey> companey = this.companeyrepo.findById(id);
	       if(companey.isPresent())
	    	   return companey.get();
	       throw new Exception("companey  not founf" +id);
	}
	}

	

