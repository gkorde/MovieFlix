package io.egen.movieflix_server.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.movieflix_server.entity.User;
import io.egen.movieflix_server.service.UserService;

@RestController
@RequestMapping(path="users")
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<User> findAll()	{
		return service.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, path="{id}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User findOne(@PathVariable("id") String userID)	{
		return service.findOne(userID);
	}
	
	@RequestMapping(method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User create(@RequestBody User usr)	{
		return service.create(usr);
	}
	
	@RequestMapping(method=RequestMethod.PUT, path="{id}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User update(@PathVariable("id") String userID, @RequestBody User usr)	{
		return service.update(userID, usr);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path="{id}")
	public void delete(@PathVariable("id") String userID)	{
		service.delete(userID);
	}
	
}
