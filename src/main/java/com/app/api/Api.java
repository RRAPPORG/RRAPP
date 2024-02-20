package com.app.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter; 

import com.user.User;
import com.user.UserDAO;
import com.user.UserDAOImpl;
import com.util.HibernateUtil;

@RestController
@RequestMapping("/api")
public class Api {
	
	@GetMapping("/data")
	public ResponseEntity<Object> getData() {
		Map<String, String> data = new HashMap<>();
		data.put("key1", "value1");
        data.put("key2", "value2");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
	
	//API methods for User-START
	@GetMapping(path="/user/get-all") //http://localhost:8080/api/user/get-all
	public ResponseEntity<String> getAllUsers() {
		UserDAO userDao = new UserDAOImpl(HibernateUtil.getSessionFactory());
		List<User> data = userDao.list();
		JSONArray userJsonArray = new JSONArray();
		for (User user: data) {
			JSONObject userJson = userDao.getUserJson(user);
			userJsonArray.put(userJson);
		}
		return new ResponseEntity<>(userJsonArray.toString(), HttpStatus.OK);
    }
	
	@PostMapping(path="/user/create", consumes = {"application/json",}) //http://localhost:8080/api/user/post-user
	public ResponseEntity<String> createUser(@RequestBody User user) {
		UserDAO userDao = new UserDAOImpl(HibernateUtil.getSessionFactory());
		userDao.save(user);
		return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@PostMapping(path="/user/update", consumes = {"application/json",}) //http://localhost:8080/api/user/post-user
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		UserDAO userDao = new UserDAOImpl(HibernateUtil.getSessionFactory());
		if (user.getUserId().equals(null)) {
			; //TODO Error Exception
		}
		userDao.update(user);
		return new ResponseEntity<>(HttpStatus.OK);
    }
	
	@PostMapping(path="/user/remove", consumes = {"application/json",}) //http://localhost:8080/api/user/post-user
	public ResponseEntity<String> removeUser(@RequestBody User user) {
		UserDAO userDao = new UserDAOImpl(HibernateUtil.getSessionFactory());
		if (user.getUserId().equals(null)) {
			; //TODO Error Exception
		}
		userDao.remove(user);
		return new ResponseEntity<>(HttpStatus.OK);
    }
	//TODO Delete user
	//TODO Registration
	//API methods for User-END
}
