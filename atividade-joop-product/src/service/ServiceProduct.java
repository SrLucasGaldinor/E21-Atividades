package service;

import java.util.ArrayList;
import classes.Product;

public class ServiceProduct {

	ArrayList<Product> list = new ArrayList<Product>();

	public ArrayList<Product> selectProduct() {
		return list;
	}

	public void insertProduct(Product product) {

		try {
			list.add(product);
			System.out.println("Produto adicionado com sucesso.");
		} catch (Exception i) {
			System.out.println("Erro ao adicionar o produto." + i.getMessage());
		}
	}

	public void exchangeProduct(int change, Product product) {
		
		try {
			list.set(change, product);
			System.out.println("Produto alterado com sucesso.");
		} catch (Exception i) {
			System.out.println("Erro ao alterar o produto. " + i.getMessage());
		}
	}

	public void removeProduct(int position) {

		try {
			list.remove(position);
			System.out.println("Produto removido com sucesso.");
		} catch (IndexOutOfBoundsException i) {
			System.out.println("Erro ao remover o produto. " + i.getMessage());
		}
		System.out.println();
	}
}
