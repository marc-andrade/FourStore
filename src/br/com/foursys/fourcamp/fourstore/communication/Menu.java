package br.com.foursys.fourcamp.fourstore.communication;

import java.util.Scanner;

import br.com.foursys.fourcamp.fourstore.controller.ProductController;

public class Menu {
	
	public void callMenuMethods() {
		
		Scanner sc = new Scanner(System.in);
		int opcao = - 1;
		
		while(opcao != 0) {
			
			interfaceMenu();
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 0:
				System.out.println("Saindo do sistema...");
				break;
			case 1:
				cadastractProduct(sc);
				break;
			case 2:
				showStock();
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
		String respost = productC.cadastractProduct(sku, qtt, originalPrice, salePrice, type, size, color, category, departamento, description);
		System.out.println("\n"+respost);
		
	}
	
	public void showStock() {
		
		ProductController prodController = new ProductController();
		
		System.out.println("\nExibindo Estoque: \n");
		System.out.println(prodController.read()+"\n");
	}
}
