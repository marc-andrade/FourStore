package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;

import br.com.foursys.fourcamp.fourstore.model.Product;

public class TransactionData {
	
	//private static ArrayList<Transaction> saleHistory = new ArrayList<Transaction>();
	private static ArrayList<Product> shoppingCart = new ArrayList<Product>();
	
	public void registerItemInCart(Product product) {
		shoppingCart.add(product);
	}
	
	public ArrayList<Product> shoppingCartList() {
		
		return shoppingCart;
	}
	
}
