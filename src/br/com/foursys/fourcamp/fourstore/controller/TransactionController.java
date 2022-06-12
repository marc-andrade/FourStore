package br.com.foursys.fourcamp.fourstore.controller;

import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;
import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.model.Transaction;
import br.com.foursys.fourcamp.fourstore.service.TransactionService;

public class TransactionController {

	TransactionService transactionS = new TransactionService();

	public String productVerify(String sku, Integer qtt) {

		Product product = new Product(sku, qtt);
		ProductController prodC = new ProductController();

		return transactionS.productVerify(prodC.verifyProduct(product), product);
	}

	public String showShoppingCart() {
		return transactionS.showShoppingCart();
	}
	
	public String showSaleHistory() {
		return transactionS.showSaleHistory();
	}

	public String cadTransaction(String cpf, PaymentMethod paymentMethod) {

		Transaction transaction = new Transaction(cpf, paymentMethod);
		
		return transactionS.endSell(transaction);
	}

	public String cadTransaction(PaymentMethod paymentMethod) {

		Transaction transaction = new Transaction(paymentMethod);

		return transactionS.endSell(transaction);
	}
	
	public String cadTransaction(PaymentMethod paymentMethod, String keyPix) {

		Transaction transaction = new Transaction(paymentMethod, keyPix);

		return transactionS.endSell(transaction);
	}
	
	public String cadTransaction(String cpf, PaymentMethod paymentMethod, String keyPix) {

		Transaction transaction = new Transaction(cpf, paymentMethod, keyPix);

		return transactionS.endSell(transaction);
	}
	
	public String cadTransaction(String cpf, PaymentMethod paymentMethod, Integer cardData) {

		Transaction transaction = new Transaction(cpf, paymentMethod, cardData);

		return transactionS.endSell(transaction);
	}
	
	public String cadTransaction(PaymentMethod paymentMethod, Integer cardData) {

		Transaction transaction = new Transaction(paymentMethod, cardData);

		return transactionS.endSell(transaction);
	}
}
