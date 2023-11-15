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
			int option = sc.nextInt();

			switch (option) {

			case 1:

				System.out.println("Informe a descrição do Produto: ");
				String description = sc.next();

				System.out.println("Informe o valor do Produto: ");
				double price = sc.nextDouble();

				System.out.println("Informe a quantidade em estoque do Produto: ");
				int stock = sc.nextInt();

				Product product = new Product(description, price, stock);

				list.insertProduct(product);
				break;

			case 2:

				System.out.println("Informe a posição do Produto que deseja remover: ");
				int position = sc.nextInt();

				list.removeProduct(position - 1);
				break;

			case 3:

				System.out.println("Informe a posição do Produto que deseja alterar: ");
				int selection = sc.nextInt();

				System.out.println("Informe a nova descrição do Produto: ");
				String newDescription = sc.next();

				System.out.println("Informe o novo valor do Produto: ");
				double newPrice = sc.nextDouble();

				System.out.println("Informe o estoque do Produto adicionado: ");
				int newStock = sc.nextInt();

				Product newProduct = new Product(newDescription, newPrice, newStock);

				list.exchangeProduct(selection - 1, newProduct);
				break;

			case 4:

				System.out.println("Informe a posição do Produto que deseja selecionar: ");
				int index = sc.nextInt();

				list.selectSingleProduct(index - 1, list);
				break;

			case 5:

				print.printAllProducts(list);
				break;

			default:
				
				System.out.println("Deseja finalizar o Programa? 1 - Sim | 2 - Não");
				int finish = sc.nextInt();

				if (finish == 1) {
					System.out.println("O Programa será Finalizado !");
					confirm = false;
				} else {
					continue;
				}
			}
		}
		System.out.println("Fim do Programa... Obrigado !");
	}
}
