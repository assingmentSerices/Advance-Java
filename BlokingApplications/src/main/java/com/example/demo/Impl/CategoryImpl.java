package com.example.demo.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.CategoryRepo;
import com.example.demo.Service.CategoryService;
@Service
public class CategoryImpl implements CategoryService {
@Autowired
	private CategoryRepo categoryrepo;
}
