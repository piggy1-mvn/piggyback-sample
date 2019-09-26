package com.yrrhelp.serviceImpl;

import javax.validation.Valid;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.yrrhelp.models.PartnerEntity;
import com.yrrhelp.models.PartnerOrder;
import com.yrrhelp.models.PartnerResponse;
import com.yrrhelp.repository.OrderRepository;
import com.yrrhelp.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderrepository;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;


	@Override
	public void createOrder(@Valid PartnerOrder order) {
		orderrepository.save(order);
		sendOrderToPartner(order);
		
	}
	
	private void sendOrderToPartner(PartnerOrder order) {
		String url = env.getProperty("partner.api.createorder");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
		HttpEntity<?> entity = new HttpEntity<>(order, headers);
		ResponseEntity<PartnerEntity> response =
				restTemplate.exchange(builder.toUriString(), HttpMethod.POST,
						entity, PartnerEntity.class);

		System.out.println("Sent order to partner order service with response code" + response.getStatusCode());
	
	}
	

}
