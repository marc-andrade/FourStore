package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;

import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductData {
	
	private static ArrayList<Product> listProduct = new ArrayList<>();

	
	public Boolean create(Product product) {
		listProduct.add(product);
		if(listProduct.isEmpty()) {
			return false;
		}
		return true;
	}

	
	public String read() {
		String respost = "";
		if(listProduct.isEmpty()) {
			respost = "Estoque Vazio.";
		}
		for(Product prod : listProduct) {
			 String aux = prod.toString() + "\n";
			 respost += aux;
		}
		
		return respost;
	}

	
	public Boolean update(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public Boolean delete(String respost) {
		// TODO Auto-generated method stub
		return null;
	}

}
