package com.yrrhelp.services;

import javax.validation.Valid;

import com.yrrhelp.models.Order;

public interface OrderService {

	void createOrder(@Valid Order order);

}
