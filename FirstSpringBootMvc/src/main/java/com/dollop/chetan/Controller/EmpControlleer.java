package com.dollop.chetan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dollop.chetan.repo.EmpRepo;
@Controller
public class EmpControlleer {
@Autowired
	private EmpRepo erapo;

@GetMapping("")
public String HomePage() {
	System.out.println("lkjkl");
	return "home";
}
}
