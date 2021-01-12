package com.tp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tp.model.User;
import com.tp.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepo;

	@GetMapping
	public String helloWorld() {
		return "hello world";
	}

	@GetMapping("/user")
	public String getUser() {
		User user = new User(1L, "naski, semer", "naskisamer@gmail.com", "***");
		return user.toString();
	}

	/*@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userRepo.save(user);
	}*/

	@PostMapping("/data")
	public String dataPost() {
		System.out.println("data");
		return "post your data";
	}

	@GetMapping("/home")
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView("homepage.html");
		return mv;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User saveUser(@Valid @RequestBody User user) {
		System.out.println("touche");
		user.setMdp(new BCryptPasswordEncoder().encode(user.getMdp()));
		return userRepo.save(user);
	}

}
