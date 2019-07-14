package com.services.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.services.drools.model.Product;
import com.services.drools.service.DroolsService;

@RestController
public class DroolsController {

	private final DroolsService jewelleryShopService;

	@Autowired
	public DroolsController(DroolsService jewelleryShopService) {
		this.jewelleryShopService = jewelleryShopService;
	}

	@RequestMapping( "/discount")
	public Product getQuestions(@RequestParam(required = true) String type) {

		Product product = new Product();
		product.setType(type);
		jewelleryShopService.getProductDiscount(product);
		return product;
	}
}
