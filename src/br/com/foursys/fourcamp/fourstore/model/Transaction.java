package br.com.foursys.fourcamp.fourstore.model;

import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;

public class Transaction {
	
	private String cpf;
	private PaymentMethod paymentMethod;
	private Double finalPrice;
	private String keyPix;
	private Integer cardData;
	
	public Transaction() {
		
	}
	
	public Transaction(String cpf, PaymentMethod paymentMethod, Integer cardData) {
		this.cpf = cpf;
		this.paymentMethod = paymentMethod;
		this.cardData = cardData;
	}
	
	public Transaction(PaymentMethod paymentMethod, Integer cardData) {
		this.paymentMethod = paymentMethod;
		this.cardData = cardData;
	}
	
	public Transaction(String cpf, PaymentMethod paymentMethod, String keyPix) {
		this.cpf = cpf;
		this.paymentMethod = paymentMethod;
		this.keyPix = keyPix;
	}
	
	public Transaction(String cpf, PaymentMethod paymentMethod) {
		this.cpf = cpf;
		this.paymentMethod = paymentMethod;
	}

	public Transaction(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public Transaction(PaymentMethod paymentMethod, String keyPix) {
		this.paymentMethod = paymentMethod;
		this.keyPix = keyPix;
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

	public String getKeyPix() {
		return keyPix;
	}

	public Integer getCardData() {
		return cardData;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
}
