package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	void save(User user) {
		repository.save(user);
		
		System.out.println("save method called");
	}

	public List<User> getAllUsers() {
		return repository.findAll();
	}

	public List<User> getUserByName(String name) {
		// validations
		List<User> filteredUsers = getAllUsers().stream().filter((user) -> user.getName().equals(name))
				.collect(Collectors.toList());
		return filteredUsers;
	}

	public List<User> getUserByAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("age cannot be negative=" + age);
		}
		List<User> filteredUsers = getAllUsers().stream().filter((user) -> user.getAge() == age).collect(Collectors.toList());
		return filteredUsers;

	}
}
