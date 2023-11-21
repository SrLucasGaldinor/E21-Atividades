package services;

import java.util.ArrayList;
import classes.Print;
import classes.Product;

public class ServiceProduct {

	ArrayList<Product> list = new ArrayList<Product>();
	Print imp = new Print();

	public ArrayList<Product> selectProduct() {
		return list;
	}

	public void insertProduct(Product product) {
		try {
			list.add(product);
			System.out.println("Produto adicionado a lista com Sucesso.");
		} catch (Exception error) {
			System.out.println("Erro ao adicionar o Produto. " + error.getMessage());
		}
		System.out.println();
	}

	public void removeProduct(int position) {
		try {
			list.remove(position);
			System.out.println("Produto removido com sucesso. ");
		} catch (Exception error) {
			System.out.println("Erro ao remover o Produto. " + error.getMessage());
		}
		System.out.println();
	}

	public void exchangeProduct(int position, Product product) {
		try {
			list.set(position, product);
			System.out.println("Produto alterado com sucesso. ");
		} catch (Exception error) {
			System.out.println("Erro ao alterar o Produto. " + error.getMessage());
		}
		System.out.println();
	}

	public void selectSingleProduct(int position, ServiceProduct product) {
		try {
			list.get(position);
			imp.printSingleProduct(position, product);
		} catch (Exception error) {
			System.out.println("Erro ao selecionar Produto." + error.getMessage());
		}
		System.out.println();
	}
}
