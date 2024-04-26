package com.ramakrishna.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

@RequestMapping("/user")

public class UserController 
{
	@Autowired
	
	private RestTemplate restTemplate;
	
	
	@GetMapping(value="/{userId}")
	public User getUser(@PathVariable("userId") String userId)
	{
		User userOne = new User(userId,"rk","989");
		
		Post post = restTemplate.getForObject("http://localhost:8585/post/1", Post.class);
		userOne.setPost(post);
		Notification nft = restTemplate.getForObject("http://localhost:8080/notification/1", Notification.class);
		userOne.setNft(nft);
	
		
		return userOne;
	}
	
	
	

}
