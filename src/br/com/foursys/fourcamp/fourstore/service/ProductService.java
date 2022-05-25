package br.com.foursys.fourcamp.fourstore.service;

import br.com.foursys.fourcamp.fourstore.data.ProductData;
import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductService {

	ProductData prodData = new ProductData();

	public String create(Product product) {

		return prodData.create(product);
	}

	public String read() {

		return prodData.read();
	}

	public String update(Product product) {
		String response = "Erro: Produto não cadastrado";
		if (prodData.checkProductExists(product)) {
			prodData.update(product);
			response = "Estoque atualizado.";
		}
		return response;
	}

	public Boolean delete() {

		if (prodData.delete()) {
			return true;
		} else {
			return false;
		}
	}

	public String verifyProduct(Product product) {
		
		String response = "";
		
		if(prodData.checkProductExists(product)) {
			if (prodData.checkQuantityOfProduct(product)) {
				response = "Produto possui estoque suficiente";
			}else {
				response = "Erro: Produto não possui estoque suficiente";
			}
		}else {
			response = "Erro: Produto não cadastrado";
		}
		
		return response;
		
	}

}
