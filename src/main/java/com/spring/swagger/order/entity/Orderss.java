package com.spring.swagger.order.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orderss {
	@Id
private int orderId;
private int orderQty;
private String orderDate;
public Orderss() {
	super();
	// TODO Auto-generated constructor stub
}
public Orderss(int orderId, int orderQty, String orderDate) {
	super();
	this.orderId = orderId;
	this.orderQty = orderQty;
	this.orderDate = orderDate;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getOrderQty() {
	return orderQty;
}
public void setOrderQty(int orderQty) {
	this.orderQty = orderQty;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
@Override
public String toString() {
	return "Orderss [orderId=" + orderId + ", orderQty=" + orderQty + ", orderDate=" + orderDate + "]";
}

}
