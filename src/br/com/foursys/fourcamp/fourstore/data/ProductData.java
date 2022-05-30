package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;

import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductData implements ProductDataInterface{

	public static ArrayList<Product> listProduct = new ArrayList<>();
	
	
	public String create(Product product) {

		if (checkProductExists(product)) {
			return "Erro: Produto já existe no estoque.";

		} else {

			listProduct.add(product);

			if (listProduct.isEmpty()) {
				return "Erro: ao criar produto.";
			}
			return "Produto cadastrado.";
		}

	}
	
	public String read() {

		String response = "";
		if (listProduct.isEmpty()) {
			response = "Estoque Vazio.";
		}

		for (Product prod : listProduct) {
			String aux = "Posição:" + (listProduct.indexOf(prod) + 1) + "\n" + prod.toString() + "\n\n";
			response += aux;
		}

		return response;
	}

	public Boolean checkProductExists(Product product) {
		boolean response = false;
		for (Product prod : listProduct) {
			if (product.getSku().equals(prod.getSku())) {
				response = true;
			}
		}
		return response;
	}
	
	public Boolean checkQuantityOfProduct(Product product) {
		
		boolean response = false;
		
		for (Product prod : listProduct) {
			if (product.getSku().equals(prod.getSku())) {
				if(product.getQtt() <= prod.getQtt()) {
					product.setSalePrice(prod.getSalePrice());
					prod.setQtt(prod.getQtt() - product.getQtt());
					
					response = true;
				}
			}
		}
		return response;
	}

	public void update(Product product) {
		
		for (Product prod : listProduct) {
			if (prod.getSku().equals(product.getSku())) {
				prod.setQtt(prod.getQtt() + product.getQtt());
			}
		}
	}

	public Boolean delete() {
		
		listProduct.clear();
		return true;
	}

	public void gambiarra() {
		listProduct.add(new Product("SKUGAMBIARRA", 10, 22.0, 29.99, "TIPOGAMBIARRA", "COXINHA TERIA TIPOS DE TAMANHO ?",
						"PQ EU PERGUNTARIA A COR DA COXINHA ?", "NHAME", "COMIDA BOA", "MUITO BOA"));
		listProduct.add(new Product("PQ N UM ID CARA ?", 12, 7.0, 10.99, "CHOCOLATE", "TAMANHO PRA COMIDA ?",
				"COR COCO", "GELADO", "SOBREMESSA", "NÃO SEI MAIS O Q DIZER"));
	}

}
