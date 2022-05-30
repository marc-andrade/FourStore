package br.com.foursys.fourcamp.fourstore.communication;

import java.util.Scanner;

import br.com.foursys.fourcamp.fourstore.controller.ProductController;
import br.com.foursys.fourcamp.fourstore.controller.TransactionController;
import br.com.foursys.fourcamp.fourstore.data.ProductData;
import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;

public class Menu {

	public void callMenuMethods() {

		Scanner sc = new Scanner(System.in);
		int option = -1;

		while (option != 0) {

			interfaceMenu();
			option = sc.nextInt();

			switch (option) {
			case 0:
				System.out.println("Saindo do sistema...");
				break;
			case 1:
				cadastractProduct(sc);
				break;
			case 2:
				showStock();
				break;
			case 3:
				updateStock(sc);
				break;
			case 4:
				truncateStock(sc);
				break;
			case 5:
				sellProduct(sc);
				break;
			case 9:
				System.out.println("\ncomando secreto!!! \n");
				ProductData comandoSecreto = new ProductData();
				comandoSecreto.gambiarra();
				break;
			default:
				break;
			}

		}

		sc.close();
	}

	public void interfaceMenu() {
		System.out.println("======= FourStore Menu =======");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Mostrar Estoque");
		System.out.println("3 - Atualizar Estoque");
		System.out.println("4 - Esvaziar estoque");
		System.out.println("5 - Venda de produtos");
		System.out.println("0 - Sair do Sistema.");
		System.out.print("Informe a opção: ");
	}

	public void cadastractProduct(Scanner sc) {

		System.out.print("\nInsira o sku do produto: ");
		String sku = sc.next();

		System.out.print("Insira a quantidade de entrada: ");
		Integer qtt = sc.nextInt();

		System.out.print("Insira o valor original(0 para manter o valor atual): ");
		Double originalPrice = sc.nextDouble();

		System.out.print("Insira o valor final do produto(0 para manter o valor atual): ");
		Double salePrice = sc.nextDouble();
		sc.nextLine();
		System.out.print("Insira o tipo do produto: ");
		String type = sc.nextLine();

		System.out.print("Insira o tamanho do produto: ");
		String size = sc.nextLine();

		System.out.print("Insira a cor do produto: ");
		String color = sc.next();

		System.out.print("Insira a categoria do produto: ");
		String category = sc.next();

		System.out.print("Insira o departamento do produto: ");
		String departamento = sc.next();
		sc.nextLine();
		System.out.print("Insira a descrição do produto: ");
		String description = sc.nextLine();

		ProductController productC = new ProductController();
		String respost = productC.cadastractProduct(sku, qtt, originalPrice, salePrice, type, size, color, category,
				departamento, description);
		System.out.println("\n" + respost + "\n");

	}

	public void showStock() {

		ProductController productC = new ProductController();
		
		System.out.println("\n========================");
		System.out.println("     Exibindo Estoque ");
		System.out.println("======================== \n");
		System.out.println(productC.read());
	}

	public void updateStock(Scanner sc) {
		ProductController productC = new ProductController();
		
		System.out.println("Atualizando estoque");
		System.out.print("\nDigite o ID do produto: ");
		sc.nextLine();
		String sku = sc.nextLine();
		System.out.print("Infome a quantidade: ");
		int qtt = sc.nextInt();

		System.out.println("\n" + productC.updateProduct(sku, qtt) + "\n");

	}

	public void truncateStock(Scanner sc) {

		System.out.println("\nTem certeza que deseja esvaziar o estoque ?");
		System.out.println("1 - Sim.");
		System.out.println("9 - Não");
		System.out.print("Digite aqui: ");
		int opcao = sc.nextInt();

		ProductController prodC = new ProductController();
		System.out.println();
		System.out.println(prodC.delete(opcao));
		System.out.println();
	}
	
	public void sellProduct(Scanner sc) {
		
		int option;
		
		System.out.println("\n==============================");
		System.out.println("     Venda de Produtos");
		System.out.println("==============================");
		
		do {
		sc.nextLine();
		System.out.print("Informe o ID do produto:");
		String sku = sc.nextLine();
		System.out.print("Infome a quantidade: ");
		Integer qtt = sc.nextInt();
		
		TransactionController transactionC = new TransactionController();
		System.out.println(transactionC.productVerify(sku, qtt));
		System.out.println();
		System.out.println(transactionC.showShoppingCart());
		System.out.println("Deseja continuar comprando ?");
		System.out.println("1 - Sim.");
		System.out.println("(*) - Outra tecla para finalizar");
		System.out.print("Digite aqui: ");
		option = sc.nextInt();
		
		}while(option == 1);
		
		do {
		System.out.println("\nSelecione a forma de pagamento");
		System.out.println("1 - Cartão de débito");
		System.out.println("2 - Cartão de crédito");
		System.out.println("3 - Dinheiro");
		System.out.println("4 - PIX");
		option = sc.nextInt();
		
		System.out.println(PaymentMethod.selectOptionMenu(option));
		}while(PaymentMethod.selectOptionMenu(option).equals("Metôdo de pagamento inválido"));
		
		PaymentMethod payMethod = PaymentMethod.optionPayment(option);
		
		System.out.println("Deseja informar CPF ?");
		System.out.println("1 - Sim.");
		System.out.println("(*) - Para não.");
		System.out.print("Digite aqui: ");
		option = sc.nextInt();
		
	}

}
