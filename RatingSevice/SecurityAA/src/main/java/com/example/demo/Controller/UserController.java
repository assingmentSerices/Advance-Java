package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Bean.User;
import com.example.demo.Service.UserService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
private UserService userservice;
	
	
	@GetMapping("/register")
	public String showReq() {
		return "UserRegister";
	}
	@GetMapping("/save")
	public String saveUser(@ModelAttribute User user ,Model model) {
		Integer id= userservice.saveUser(user);
		String message="User"+id+"'created'";
		model.addAttribute("message", message);
		return "UserRegister";
	}
}
