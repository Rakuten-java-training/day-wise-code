package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;

	@PostMapping
	void saveOrder(@RequestBody Order order) {
		orderService.save(order);
		System.out.println(order.getItem());
	}
	@GetMapping
	List<Order> getAllOrder() {
		return orderService.getAllOrders();
	}
}
