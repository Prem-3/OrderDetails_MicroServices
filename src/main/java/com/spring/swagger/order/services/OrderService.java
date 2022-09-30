package com.spring.swagger.order.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.swagger.order.entity.Orderss;
import com.spring.swagger.order.repository.OrderRepo;

@Service
public class OrderService {
	@Autowired
	private OrderRepo serviceRepo;

	public List<Orderss> getAllOrders() {
		List<Orderss> orders = new ArrayList<>();
		serviceRepo.findAll().forEach(orders::add);
		return orders;
	}
	
	public Orderss addOrder(Orderss order) {
		return this.serviceRepo.save(order);
	}
	
	public Orderss updateOrder(Integer orderId, Orderss order) {
		return this.serviceRepo.save(order);
	}

	public void deleteOrder(Integer orderId) {
		this.serviceRepo.deleteById(orderId);
	}
}
