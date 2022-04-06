package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;

	List<User> users = new ArrayList<>();

	@PostMapping
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		users.add(user);
		service.save(user);
	}

	@GetMapping // localhost:8081/user
	List<User> getUsers() {
		return users;
	}

	@GetMapping("/{name}")
	List<User> getUsersByName(@PathVariable String name) {
//		??
		System.out.println(name);
		List<User> filteredUsers = users.stream().filter((user) -> user.getName().equals(name))
				.collect(Collectors.toList());
		return filteredUsers;
	}

	@GetMapping("/age/{age}") // localhost:8081/user/age/20
	List<User> getUsersByage(@PathVariable int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("age cannot be negative=" + age);
		}
		List<User> filteredUsers = users.stream().filter((user) -> user.getAge() == age).collect(Collectors.toList());
		return filteredUsers;
	}
}
