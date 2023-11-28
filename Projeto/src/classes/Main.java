package classes;

import java.util.Scanner;
import utils.ProdutoDAO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean confirm = true;

		while (confirm) {
			Print imp = new Print();
			imp.print();
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Informe a Descri��o do Produto: ");
				String description = sc.next();

				System.out.println("Informe o Valor do Produto: ");
				double price = sc.nextDouble();

				System.out.println("Informe o Estoque do Produto adicionado: ");
				int stock = sc.nextInt();

				Product product = new Product(description, price, stock);

				ProdutoDAO.salvar(product);
				break;

			case 2:
				System.out.println("Informe a posi��o do Produto que deseja Remover: ");
				int position = sc.nextInt();

				ProdutoDAO.remover(position);
				break;

			case 3:
				System.out.println("Informe a posi��o do Produto que deseja Alterar: ");
				int index = sc.nextInt();

				System.out.println("Informe o nome do Produto: ");
				String newDescription = sc.next();

				System.out.println("Informe o Valor: ");
				double newPrice = sc.nextDouble();

				System.out.println("Informe o Estoque: ");
				int newStock = sc.nextInt();

				Product newProduct = new Product(newDescription, newPrice, newStock);

				ProdutoDAO.alterar(index, newProduct);
				break;

			case 4:
				System.out.println("Informe a posi��o do Produto que deseja Selecionar: ");
				int selection = sc.nextInt();

				ProdutoDAO.selecionar(selection);
				break;

			case 5:
				ProdutoDAO.consultar();
				break;
				
			default:

				System.out.println("Deseja finalizar o Programa? 1 - Sim | 2 - N�o");
				int finish = sc.nextInt();

				if (finish == 1) {
					System.out.println("O Programa ser� Finalizado !");
					confirm = false;
				} else {
					continue;
				}
			}
		}
		System.out.println("Fim do Programa... Obrigado !");
	}
}
