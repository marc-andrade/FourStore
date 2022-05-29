package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.TransactionService;

public class TransactionController {
	
	TransactionService transactionS = new TransactionService();
	
	public String productVerify(String sku, Integer qtt) {
		
		Product product = new Product(sku, qtt);
		ProductController prodC = new ProductController();
		
		return transactionS.productVerify(prodC.verifyProduct(product),product);
	}
	
	public String showShoppingCart() {
		return transactionS.showShoppingCart();
	}
}
