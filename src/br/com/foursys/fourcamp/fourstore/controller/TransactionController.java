package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.TransactionService;

public class TransactionController {
	
	public String productVerify(String sku, Integer qtt) {
		
		Product product = new Product(sku, qtt);
		ProductController prodC = new ProductController();
		TransactionService transactionS = new TransactionService();
		
		return transactionS.productVerify(prodC.verifyProduct(product),product);
		
	}
}
