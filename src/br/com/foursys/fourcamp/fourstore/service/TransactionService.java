package br.com.foursys.fourcamp.fourstore.service;

import br.com.foursys.fourcamp.fourstore.data.TransactionData;
import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;
import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.model.Transaction;

public class TransactionService {
	
	TransactionData transactionD = new TransactionData();
	
	public String productVerify(String response,Product product) {
		
		
		if(response.equals("Produto possui estoque suficiente")) {
			product.setSalePrice(product.getSalePrice() * product.getQtt());
			if(transactionD.registerItemInCart(product)) {
				return "\nProduto adicionado no carrinho";
				
			}else {
				return "\nErro: falha ao adicionar no carrinho";
			}
			
			
		}else {
			return "\n"+response;
		}
	}
	
	public double cartTotalPrice() {
		double total = 0;
		
		for(Product prod : transactionD.shoppingCartList()) {
			total += prod.getSalePrice();
		}
		
		return total;
	}
	
	public String showShoppingCart() {
		String response = "";
		if(transactionD.shoppingCartList().isEmpty()) {
			response = "Carrinho vazio.";
			
		} else {
			for(Product prod : transactionD.shoppingCartList()) {
				response += "Item:" + (transactionD.shoppingCartList().indexOf(prod) + 1) 
						+ ", SKU: " + prod.getSku() 
						+ ", Quantidade: " + prod.getQtt()
						+ ", Preço total: " + prod.getSalePrice()
						+ "\n";
			}
		}
		
		return response;
	}
	
	public String endSell(Transaction transaction) {
		
		String response = "";
		transaction.setFinalPrice(cartTotalPrice());
		
		
		if(transactionD.registerTransactionHistory(transaction)) {
			response ="\nVenda realizada com sucesso.\n\n" + "Itens comprados: \n\n" +showShoppingCart();
			if (transaction.getPaymentMethod() == PaymentMethod.DEBIT) {
				response += "\nPreço final: " + transaction.getFinalPrice()
						+ "\nMetôdo de pagamento: " + transaction.getPaymentMethod().getDescripiton()
						+ "\nNúmero do cartão: " + transaction.getCardData();
				
			} else if (transaction.getPaymentMethod() == PaymentMethod.CREDIT) {
				response += "\nPreço final: " + transaction.getFinalPrice()
				+ "\nMetôdo de pagamento: " + transaction.getPaymentMethod().getDescripiton()
				+ "\nNúmero do cartão: " + transaction.getCardData();
				
			} else if (transaction.getPaymentMethod() == PaymentMethod.MONEY) {
				response += "\nPreço final: " + transaction.getFinalPrice()
				+ "\nMetôdo de pagamento: " + transaction.getPaymentMethod().getDescripiton();
				
			} else if (transaction.getPaymentMethod() == PaymentMethod.PIX) {
				response += "\nPreço final: " + transaction.getFinalPrice()
				+ "\nMetôdo de pagamento: " + transaction.getPaymentMethod().getDescripiton()
				+ "\nChave PIX: " + transaction.getKeyPix();
			}
			
		} else {
			response = "Erro: falha ao realizar venda.";
		}
		
		if(transaction.getCpf() != null) {
			response += "\nCPF: " + transaction.getCpf();
		}
		transactionD.deleteCartList();
		return response;
	}
}
