package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entity.User;
import com.example.demo.ServiceImpl.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	 @Autowired
	    private UserService userService;

	    @GetMapping("/signup")
	    public String showSignUpForm(Model model) {
	        model.addAttribute("user", new User());
	        return "signup";
	    }

	    @PostMapping("/signup")
	    public String registerUser(@ModelAttribute User user) {
	        userService.registerUser(user);
	        return "redirect:/login";
	    }

	    @GetMapping("/login")
	    public String showLoginForm() {
	        return "login";
	    }
}
