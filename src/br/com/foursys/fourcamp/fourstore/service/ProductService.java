package br.com.foursys.fourcamp.fourstore.service;

import br.com.foursys.fourcamp.fourstore.data.ProductData;
import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductService {
	
	ProductData prodData = new ProductData();
	
	public Boolean create(Product product) {
		
		if (prodData.create(product)) {
			return true;
		} else {
			return false;
		}
	}

	public String read() {
		
		String respost;
		respost = prodData.read();
		
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
