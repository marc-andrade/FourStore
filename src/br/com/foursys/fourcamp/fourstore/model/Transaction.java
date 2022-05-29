package br.com.foursys.fourcamp.fourstore.model;

import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;

public class Transaction {
	
	private String cpf;
	private PaymentMethod paymentMethod;
	private Double valueOfSale;
	
	public Transaction() {
		
	}
	
	public Transaction(String cpf, PaymentMethod paymentMethod, Double valueOfSale) {
		this.cpf = cpf;
		this.paymentMethod = paymentMethod;
		this.valueOfSale = valueOfSale;
	}

	public Transaction(PaymentMethod paymentMethod, Double valueOfSale) {
		this.paymentMethod = paymentMethod;
		this.valueOfSale = valueOfSale;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getCpf() {
		return cpf;
	}

	
	public Double getValueOfSale() {
		return valueOfSale;
	}

	
}
