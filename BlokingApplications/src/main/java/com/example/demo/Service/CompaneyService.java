package com.example.demo.Service;

import com.example.demo.Bean.Companey;




public interface CompaneyService {
	public Companey addCompaney(Companey companey);
	public Companey  getCompaneyById(Long id)throws Exception;
}
