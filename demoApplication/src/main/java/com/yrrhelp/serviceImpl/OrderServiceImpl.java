package com.yrrhelp.serviceImpl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yrrhelp.models.Order;
import com.yrrhelp.repository.OrderRepository;
import com.yrrhelp.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderrepository;

	@Override
	public void createOrder(@Valid Order order) {
		orderrepository.save(order);
		
	}

}
