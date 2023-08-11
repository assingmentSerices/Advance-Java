package com.dollop.chetan.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dollop.chetan.Bean.User;
import com.dollop.chetan.Repo.UserRepo;

@Controller
public class Usercontroller {

	@Autowired
	   private UserRepo userService;
	    
	   @GetMapping("/")
	   public String getUsers(ModelMap model) {
		    List<User> users = this.userService.findAll();
		     System.out.println("hello");
		    model.addAttribute("userList",users );
		    return "Updata";
	   }
	   
	   @PostMapping("/add")
	   public String addUser(@ModelAttribute User user,Model model) {
		   
		     this.userService.save(user);
		     List<User> users = this.userService.findAll();
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
		    Optional<User> user1 = this.userService.findById(id);
		     model.addAttribute("user", user1.get());
		     return "edit";
		    
	   }
	   @PostMapping("/update")
	   public String updateUser(@ModelAttribute User user,Model model) {
		   
		   this.userService.save(user);
		   List<User> users = this.userService.findAll();
		   
		    model.addAttribute("userList",users );
		   model.addAttribute("msg", "Successfully updated");
		   return "Updata";
	   }
	   
	   @GetMapping("/delete/{id}")
	   public String deletUser(@PathVariable("id") Integer id ,Model model) {
		   this.userService.deleteById(id);
		   List<User> users = this.userService.findAll();
		     System.out.println();
		    model.addAttribute("userList",users );
		   model.addAttribute("msg", "Deleted Successfully ");
		   return "Updata";
	   } 
	   
	   
	}


