package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;

import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.model.Transaction;

public class TransactionData {
	
	private static ArrayList<Transaction> saleHistory = new ArrayList<Transaction>();
	private static ArrayList<Product> shoppingCart = new ArrayList<Product>();
	
	public Boolean registerItemInCart(Product product) {
		return shoppingCart.add(product);
	}
	
	public ArrayList<Product> shoppingCartList() {
		
		return shoppingCart;
	}
	
	public void deleteCartList(){
		
		shoppingCart.clear();
	}
	
	public Boolean registerTransactionHistory(Transaction transaction) {
		return saleHistory.add(transaction);
	}
	
	public ArrayList<Transaction> showSaleHistory(){
		
		return saleHistory;
	}
}
