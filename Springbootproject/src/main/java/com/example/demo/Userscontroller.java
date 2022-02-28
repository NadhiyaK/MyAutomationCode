package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Userscontroller {

//	@GetMapping
//	public String getUsers()
//	{
//		return "I have triggered Get method";
//	}
	
	@GetMapping(path="/{userID}")
	public String getUser(@PathVariable String userID)
	{
		return "I have triggered Get method for the path parameter for the user: " +userID;
	}
	
	@GetMapping
	public String getUserquery(@RequestParam(value = "page") int pageno, @RequestParam(value="limit") int limit)
	{
		return "I have triggered Get method for Query parameter for page :"+pageno +"and limit "+limit;
	}
	
	@PutMapping
	public String updateUsers()
	{
		return "I have triggered PUT method";
	}
	
	@DeleteMapping
	public String deleteUsers()
	{
		return "I have triggered DELETE method";
	}
	
	@PostMapping
	public String createUsers()
	{
		return "I have triggered POST method";
	}
	
}
