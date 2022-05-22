package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.ProductService;

public class ProductController {
	
	public String cadastractProduct(String sku, Integer qtt, Double originalPrice, Double salePrice, String type, String size,
			String color, String category, String departament, String description) {
			
		String respost = "Não foi possivel criar este produto no estoque";
		Product product = new Product(sku, qtt, originalPrice, salePrice, type, size, color, category, departament, description);
		
			ProductService productService = new ProductService();
			if(productService.create(product)) {
				respost = "Cadastro realizado com sucesso.";
			}
			
		return respost;
	}
	
	public String read() {
		String respost;
		ProductService prodService = new ProductService();
		respost = prodService.read();
		
		return respost;
	}
}
