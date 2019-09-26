package com.yrrhelp.services;

import javax.validation.Valid;

import com.yrrhelp.models.PartnerOrder;

public interface OrderService {

	void createOrder(@Valid PartnerOrder partnerOrder);

}
