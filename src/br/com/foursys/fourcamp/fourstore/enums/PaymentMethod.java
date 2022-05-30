package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentMethod {

	DEBIT(1,"D�bito"), CREDIT(2,"Cr�dito"), MONEY(3,"Dinheiro"), PIX(4,"PIX");

	private final int value;
	private final String descripiton;
	
	PaymentMethod(int value) {
		this.value = value;
		this.descripiton = "";
		
	}

	PaymentMethod(int value, String descripiton) {
		this.value = value;
		this.descripiton = descripiton;
	}

	public int getValue() {
		return value;
	}
	
	public String getDescripiton() {
		return descripiton;
	}

	public static String selectOptionMenu(int value) {

		String response = "Error";
		if (value == PaymentMethod.DEBIT.getValue()) {
			response = "Cart�o de d�bito";
		} else if (value == PaymentMethod.CREDIT.getValue()) {
			response = "Cart�o de cr�dito";
		} else if (value == PaymentMethod.MONEY.getValue()) {
			response = "Pagamento em Dinheiro";
		} else if (value == PaymentMethod.PIX.getValue()) {
			response = "Pagamento em PIX";
		} else {
			response = "Met�do de pagamento inv�lido";
		}

		return response;

	}

	public static PaymentMethod optionPayment(int value) {

		PaymentMethod response = null;
		if (value == PaymentMethod.DEBIT.getValue()) {
			response = PaymentMethod.DEBIT;
		} else if (value == PaymentMethod.CREDIT.getValue()) {
			response = PaymentMethod.CREDIT;
		} else if (value == PaymentMethod.MONEY.getValue()) {
			response = PaymentMethod.MONEY;
		} else if (value == PaymentMethod.PIX.getValue()) {
			response = PaymentMethod.PIX;
		}
		return response;

	}

	
}
