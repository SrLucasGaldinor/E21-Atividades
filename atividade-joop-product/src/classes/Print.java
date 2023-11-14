package classes;

import service.ServiceProduct;

public class Print {
	
	public void print() {
		System.out.println("<- Selecione uma das op��es ->");
		System.out.println();
		System.out.println("1 -> Inserir um Produto.");
		System.out.println("2 -> Alterar produto.");
		System.out.println("3 -> Remover produto.");
		System.out.println("4 -> Mostrar um �nico produto.");
		System.out.println("5 -> Mostrar todos os produtos.");
		System.out.println();
		System.out.println("<- Digite qualquer outro n�mero para sair do Programa ->");
		System.out.println();
	}
	
	public void printSingleProduct(ServiceProduct list, int position) {
		System.out.println();
		System.out.println("<- �nico Produto ->");
		System.out.println();
		System.out.println("Posi��o do Produto -> [" + (position + 1) + "]");
		System.out.println("Nome: " + list.selectProduct().get(position).getDescription());
		System.out.println("Valor: R$ " + list.selectProduct().get(position).getPrice());
		System.out.println("Estoque: " + list.selectProduct().get(position).getStock());
		System.out.println();
	}
	
	public void printAllProducts(ServiceProduct list) {
		System.out.println();
		System.out.println("<- Lista de Produtos ->");
		System.out.println();
		for(int i = 0; i < list.selectProduct().size(); i++) {
			System.out.println("Posi��o do Produto -> [" + (i + 1) + "]");
			System.out.println("Nome: " + list.selectProduct().get(i).getDescription());
			System.out.println("Valor: R$ " + list.selectProduct().get(i).getPrice());
			System.out.println("Estoque: " + list.selectProduct().get(i).getStock());
			System.out.println("===============================");
		}
		System.out.println();
	} 	
}
