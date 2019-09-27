package com.incentives.piggyback.sampleApp.controllers;

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

import com.incentives.piggyback.sampleApp.models.Location;
import com.incentives.piggyback.sampleApp.models.Order;
import com.incentives.piggyback.sampleApp.models.PartnerOrder;
import com.incentives.piggyback.sampleApp.models.PartnerResponse;
import com.incentives.piggyback.sampleApp.services.OrderService;


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
	  
	        model.addAttribute("email", order.getEmail());
	        model.addAttribute("address", order.getAddress());
	        model.addAttribute("pincode", order.getPincode());
	        orderService.createOrder(order);
	        return "orderSuccess";
	    }
	
}
