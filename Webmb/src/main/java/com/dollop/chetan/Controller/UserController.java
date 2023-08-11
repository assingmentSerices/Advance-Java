package com.dollop.chetan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dollop.chetan.Bean.User;
import com.dollop.chetan.service.UserService;


@Controller
public class UserController {
	
	   @Autowired
	   private UserService userService;
	    
	   @GetMapping("")
	   public String getUsers(ModelMap model) {
		    List<User> users = this.userService.getUsers();
		     System.out.println("kjlkkl");
		    model.addAttribute("userList",users );
		    return "Updata";
	   }
	   
	   @PostMapping("/add")
	   public String addUser(@ModelAttribute User user,Model model) {
		   
		     this.userService.createUser(user);
		     List<User> users = this.userService.getUsers();
		     System.out.println();
		    model.addAttribute("userList",users );
		     model.addAttribute("msg", "Successfully added");
		       return "Updata";
	   }
	   
	   @GetMapping("/add-user")
	   public String addUserPage() {
		   System.out.println("addUser");
		   return "add";
	   }
	   
	   
	   @GetMapping("/edit/{id}")
	   public String editUser(@PathVariable("id") Integer id,Model model) {
		    User user1 = this.userService.getUserByID(id);
		     model.addAttribute("user", user1);
		     return "edit";
		    
	   }
	   @PostMapping("/update")
	   public String updateUser(@ModelAttribute User user,Model model) {
		   
		   this.userService.updateUser(user);
		   List<User> users = this.userService.getUsers();
		   
		    model.addAttribute("userList",users );
		   model.addAttribute("msg", "Successfully updated");
		   return "Updata";
	   }
	   
	   @GetMapping("/delete/{id}")
	   public String deletUser(@PathVariable("id") Integer id ,Model model) {
		   this.userService.deleteUser(id) ;
		   List<User> users = this.userService.getUsers();
		     System.out.println();
		    model.addAttribute("userList",users );
		   model.addAttribute("msg", "Deleted Successfully ");
		   return "Updata";
	   } 
	   
	   
	}


