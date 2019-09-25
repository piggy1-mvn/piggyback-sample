package com.yrrhelp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yrrhelp.models.Offer;
import com.yrrhelp.repository.OfferAppRepository;
import com.yrrhelp.services.OfferService;

@Service
public class OfferServiceImpl implements OfferService {
	
	@Autowired
	private OfferAppRepository offerAppRepository;

	@Override
	public void createOffer(Offer offer) {
		offerAppRepository.save(offer);
	}

	@Override
	public double getOfferValue(String code) {
		if(offerAppRepository.findAll() != null) {
		return 10;
		}
		return 0;
	}

}
