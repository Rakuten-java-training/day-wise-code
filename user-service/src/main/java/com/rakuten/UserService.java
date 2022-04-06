package com.rakuten;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	void save(User user) {
		System.out.println("save method called");
	}
}
