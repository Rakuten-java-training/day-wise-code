package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	List<User> users = new ArrayList<>();

	void save(User user) {
		users.add(user);
		System.out.println("save method called");
	}

	public List<User> getAllUsers() {
		return users;
	}

	public List<User> getUserByName(String name) {
		// validations
		List<User> filteredUsers = users.stream().filter((user) -> user.getName().equals(name))
				.collect(Collectors.toList());
		return filteredUsers;
	}

	public List<User> getUserByAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("age cannot be negative=" + age);
		}
		List<User> filteredUsers = users.stream().filter((user) -> user.getAge() == age).collect(Collectors.toList());
		return filteredUsers;

	}
}
