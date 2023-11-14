package classes;

import java.util.Scanner;
import service.ServiceProduct;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServiceProduct list = new ServiceProduct();
		Print print = new Print();

		boolean confirm = true;

		while (confirm) {
			print.print();
			String option = sc.next();

			switch (option) {

			case "1":

				System.out.println("Informe a descricao do Produto: ");
				String description = sc.next();

				System.out.println("Informe o valor do Produto: ");
				double price = sc.nextDouble();

				System.out.println("Informe o estoque do Produto: ");
				int stock = sc.nextInt();

				Product product = new Product(description, price, stock);

				list.insertProduct(product);
				break;
				
			case "2":
				
				System.out.println("Informe a posi��o do Produto que deseja alterar: ");
				int change = sc.nextInt();
				
				System.out.println("Informe a nova descricao do Produto: ");
				String newDescription = sc.next();

				System.out.println("Informe o novo valor do Produto: ");
				double newPrice = sc.nextDouble();

				System.out.println("Informe o estoque do novo Produto: ");
				int newStock = sc.nextInt();
				
				Product newProduct = new Product(newDescription, newPrice, newStock);
				
				list.exchangeProduct(change - 1, newProduct);
				break;
				
			case "3":
				
				System.out.println("Informe a posi��o do Produto de deseja remover: ");
				int position = sc.nextInt();
				list.removeProduct(position - 1);
				break;
				
			case "4":
				
				System.out.println("Informe a posi��o do Produto que deseja selecionar: ");
				int selection = sc.nextInt();
				print.printSingleProduct(list, selection - 1);
				break;
				
			case "5":
				
				print.printAllProducts(list);
				break;
				
			default:
				System.out.println("Deseja finalizar o Programa? 1 = Sim | 2 = N�o");
				int finish = sc.nextInt();
				
				if(finish == 1) {
					confirm = false;
					System.out.println("O Programa ser� Finalizado.");
				}else {
					continue;
				}
			}
		}
		System.out.println("Fim do Programa ! Obrigado. ");
	}
}
