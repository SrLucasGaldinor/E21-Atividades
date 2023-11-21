package classes;

import services.ServiceProduct;

public class Print {
		
	public void print() {
		System.out.println("");
		System.out.println("<- Selecione uma das opções ->");
		System.out.println();
		System.out.println("1 -> Inserir um Produto.");
		System.out.println("2 -> Remover um Produto.");
		System.out.println("3 -> Alterar um Produto.");
		System.out.println("4 -> Selecionar um único Produto.");
		System.out.println("5 -> Exibir a Lista de Produtos.");
		System.out.println("");
		System.out.println("<- Digite qualquer outro número para encerrar o Programa ->");
		System.out.println("");
	}

	public void printAllProducts(ServiceProduct list) {
		System.out.println();
		System.out.println("<- Lista de Produtos ->");
		System.out.println();
		for (int i = 0; i < list.selectProduct().size(); i++) {
			System.out.println("Posição do Produto -> [" + (i + 1) + "]");
			System.out.println("Nome: " + list.selectProduct().get(i).getDescription());
			System.out.println("Valor: R$ " + list.selectProduct().get(i).getPrice());
			System.out.println("Estoque: " + list.selectProduct().get(i).getStock());
			System.out.println("-------------------------");
		}
		System.out.println();
	}
	
	public void printSingleProduct(int position, ServiceProduct product) {
		
		System.out.println("Produto selecionado com Sucesso.");
		System.out.println();
		System.out.println("Posição -> [" + (position + 1) + "]");
		System.out.println("Nome: " + product.selectProduct().get(position).getDescription());
		System.out.println("Valor: R$ " + product.selectProduct().get(position).getPrice());
		System.out.println("Estoque: " + product.selectProduct().get(position).getStock());
	}
}
