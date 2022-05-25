package br.com.foursys.fourcamp.fourstore.model;

public class Transaction {
	
	private String cpf;
	private String paymentMethod;
	private Double valueOfSale;
	
	public Transaction() {
		
	}
	
	public Transaction(String cpf, String paymentMethod, Double valueOfSale) {
		this.cpf = cpf;
		this.paymentMethod = paymentMethod;
		this.valueOfSale = valueOfSale;
	}

	public Transaction(String paymentMethod, Double valueOfSale) {
		this.paymentMethod = paymentMethod;
		this.valueOfSale = valueOfSale;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getCpf() {
		return cpf;
	}

	
	public Double getValueOfSale() {
		return valueOfSale;
	}

	
}
