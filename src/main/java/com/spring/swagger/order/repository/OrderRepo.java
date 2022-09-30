package com.spring.swagger.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.swagger.order.entity.Orderss;

@Repository
public interface OrderRepo extends CrudRepository<Orderss, Integer> {

}
