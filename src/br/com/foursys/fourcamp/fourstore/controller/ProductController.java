package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.ProductService;

public class ProductController {
	
	ProductService prodService = new ProductService();
	
	public String cadastractProduct(String sku, Integer qtt, Double originalPrice, Double salePrice, String type,
			String size, String color, String category, String departament, String description) {

		Product product = new Product(sku, qtt, originalPrice, salePrice, type, size, color, category, departament,
				description);
		
		return prodService.create(product);
	}

	public String read() {

		return  prodService.read();
	}

	public String updateProduct(String SKU, Integer qtt) {
		
		Product product  = new Product(SKU, qtt);
		
		return prodService.update(product);
	}
	
	public String delete(Integer option) {
		String response = null;
		
		if(option == 1) {
			if(prodService.delete()) {
				response = "Lista esvaziada";
			}else {
				response = "Erro: algo deu errado";
			}
			
		}else if(option == 9) {
			response = "Voltando ao menu...";
		}else {
			response = "Opção inválida voltando ao menu...";
		}
		return response;
	}
	
	public String verifyProduct(Product product) {
		
		return prodService.verifyProduct(product);
		
	}
}
