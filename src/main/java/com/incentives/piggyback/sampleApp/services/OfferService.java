package com.incentives.piggyback.sampleApp.services;

import org.springframework.stereotype.Service;

import com.incentives.piggyback.sampleApp.models.Offer;


public interface OfferService {
	
	void createOffer(Offer offer);
	
	double getOfferValue(String code);
	

}
