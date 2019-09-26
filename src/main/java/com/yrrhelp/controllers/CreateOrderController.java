package com.yrrhelp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.yrrhelp.models.PartnerOrder;
import com.yrrhelp.models.Location;
import com.yrrhelp.models.Order;
import com.yrrhelp.models.PartnerResponse;
import com.yrrhelp.services.OrderService;


@Controller
public class CreateOrderController {
	
	@Autowired
	OrderService orderService;
	
	
	 @RequestMapping(value = "/order", method = RequestMethod.GET)
	    public ModelAndView showForm() {
	        return new ModelAndView("createorder", "order", new Order());
	    }
	 
	    @RequestMapping(value = "/createOrder", method = RequestMethod.POST)
	    public String submit(@Valid @ModelAttribute("order")Order order, 
	      BindingResult result, ModelMap model) {
	        if (result.hasErrors()) {
	            return "error";
	        }
	  
	        PartnerOrder partnerOrder = new PartnerOrder();
	        Location location = new Location();
	        model.addAttribute("email", order.getEmail());
	        model.addAttribute("address", order.getAddress());
	        model.addAttribute("pincode", order.getPincode());
	        partnerOrder.setPartnerId("79a0f662-625e-424f-8e36-86232c56daa9");
	        partnerOrder.setInitiatorUserId("123345678");
	        partnerOrder.setMaxOptimizations(3);
	        partnerOrder.setOptimizationDuration(3600);
	        partnerOrder.setOptimizationRadius(10);	
	        location.setLongitude(1.293014);
	        location.setLatitude(103.774095);
	        partnerOrder.setLocation(location);
	        partnerOrder.setOrderStatus("ACTIVE");
	        partnerOrder.setOrderType("FOOD");
	        partnerOrder.setPartnerDisplayName("FOOD STORE");
	        partnerOrder.setPartnerRedirectUrl("http://localhost:8080/");
	        //partnerOrder.setPartnerWebHookAddress("http://localhost:8080/PartnerApp/offers");
	        orderService.createOrder(partnerOrder);
	        return "orderSuccess";
	    }
	
}
