package com.yrrhelp.services;

import org.springframework.stereotype.Service;

import com.yrrhelp.models.Offer;


public interface OfferService {
	
	void createOffer(Offer offer);
	
	double getOfferValue(String code);
	

}
