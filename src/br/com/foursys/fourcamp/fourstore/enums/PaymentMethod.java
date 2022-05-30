package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentMethod {

	DEBIT(1), CREDIT(2), MONEY(3), PIX(4);

	private final int value;

	PaymentMethod(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static String selectOptionMenu(int value) {

		String response = "Error";
		if (value == PaymentMethod.DEBIT.getValue()) {
			response = "Cartão de débito";
		} else if (value == PaymentMethod.CREDIT.getValue()) {
			response = "Cartão de crédito";
		} else if (value == PaymentMethod.MONEY.getValue()) {
			response = "Pagamento em Dinheiro";
		} else if (value == PaymentMethod.PIX.getValue()) {
			response = "Pagamento em PIX";
		} else {
			response = "Metôdo de pagamento inválido";
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
