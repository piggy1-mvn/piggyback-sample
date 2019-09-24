package com.yrrhelp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yrrhelp.models.Offer;
import com.yrrhelp.services.OfferService;


@RestController
@RequestMapping("/PartnerApp")
public class OfferController {
	
	@Autowired
	OfferService offerService;
     
      @PostMapping("/offers")
      public void getProductById(@RequestBody Offer offer) {
    	  offerService.createOffer(offer);

      }
}
