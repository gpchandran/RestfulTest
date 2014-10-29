package com.poorna.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/json/product")
public class JSONService {

	@GET
	@Path("/get")
	@Produces("application/json")
	//Get service
	public Product getProductInJSON() {

		Product product = new Product();
		product.setName("iPad 3");
		product.setQty(999);

		return product;

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	@Produces("application/json")
	//Post Json service
	public Product createProductInJSON(Product product) {

		String result = "Product created : " + product;
		System.out.println(result);
		Product product1 = new Product();
		product1.setName(product.getName() + " Response");
		product1.setQty(product.getQty());
		return product1;

	}

}
