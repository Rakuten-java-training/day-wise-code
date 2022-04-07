package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service; // only reference

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED) //set response code to 201
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		service.save(user);
	}

	@GetMapping // localhost:8081/user
	List<User> getUsers() {
		return service.getAllUsers();
	}

//
	@GetMapping("/{name}")
	List<User> getUsersByName(@PathVariable String name) {
		System.out.println(name);
		return service.getUserByName(name);
	}

	@GetMapping("/age/{age}") // localhost:8081/user/age/20
	List<User> getUsersByage(@PathVariable int age) {

		List<User> filteredUsers = service.getUserByAge(age);
		return filteredUsers;
	}
}
