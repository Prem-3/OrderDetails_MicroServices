package com.spring.swagger.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.swagger.order.entity.Orderss;
import com.spring.swagger.order.services.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;

	@GetMapping("/orders")
	public List<Orderss> ngetAllOrders() {
		return this.service.getAllOrders();
	}

	@PostMapping("/orders/addorders")
	public Orderss addOrder(@RequestBody Orderss order) {
		return this.service.addOrder(order);
	}
	
	@PutMapping("/updateorders/{orderId}")
	public Orderss updateorder(@PathVariable String orderId,@RequestBody Orderss order) {
		return this.service.updateOrder(Integer.parseInt(orderId), order);
	}
	
	@DeleteMapping("/deleteorders/{orderId}")
	public void deleteOrder(@PathVariable int orderId) {
		this.service.deleteOrder(orderId);
	}
}
