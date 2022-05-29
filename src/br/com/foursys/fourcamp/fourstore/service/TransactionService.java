package br.com.foursys.fourcamp.fourstore.service;

import br.com.foursys.fourcamp.fourstore.data.TransactionData;
import br.com.foursys.fourcamp.fourstore.model.Product;

public class TransactionService {
	
	TransactionData transactionD = new TransactionData();
	
	public String productVerify(String response,Product product) {
		
		if(response.equals("Produto possui estoque suficiente")) {
			transactionD.registerItemInCart(product);
			return "Produto adicionado no carrinho";
			
		}else if(response.equals("Erro: Produto não possui estoque suficiente")) {
			return response;
		}
		else {
			return "Falha ao vender o produto";
		}
	}
	
	public String showShoppingCart() {
		String response = "";
		if(transactionD.shoppingCartList().isEmpty()) {
			response = "Carrinho vazio.";
			
		} else {
			for(Product prod : transactionD.shoppingCartList()) {
				response += "Item:" + (transactionD.shoppingCartList().indexOf(prod) + 1) 
						+ "\nSKU: " + prod.getSku() 
						+ ", Quantidade: " + prod.getQtt()
						+ ", Preço de Venda: " + prod.getSalePrice()
						+ "\n";
			}
		}
		
		return response;
	}
}
