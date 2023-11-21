package services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import classes.Product;

public class ServiceFile {

	public void createAndDeleteFile(String FILE, int response) {
		File file = new File(FILE);
		try {
			if(response == 2) {
				file.delete();
				file.createNewFile();
			}
		} catch (IOException error) {
			System.out.println("Falha na criação de arquivo. " + error.getMessage());
		}
	}
		
	public void writeToFile(ServiceProduct list, String FILE) {
		try {
			FileWriter writer = new FileWriter(FILE);
			for(int i = 0; i < list.selectProduct().size(); i++) {
			writer.write(list.selectProduct().get(i).getDescription());
			writer.write("\n");
			writer.write(String.valueOf(list.selectProduct().get(i).getPrice()));
			writer.write("\n");
			writer.write(String.valueOf(list.selectProduct().get(i).getStock()));
			writer.write("\n");
			}
			writer.close();
		} catch (IOException error) {
		System.out.println("Falha na inserção de dados no arquivo. " + error.getMessage());
		}
	}
	
	public void readFile(String FILE, ServiceProduct list) {
		File file = new File(FILE);
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String reloadDescription = reader.nextLine();
				double reloadPrice = Double.parseDouble(reader.nextLine());
				int reloadStock = Integer.parseInt(reader.nextLine());
				
				Product reloadProduct = new Product(reloadDescription, reloadPrice, reloadStock);
			
				list.insertProduct(reloadProduct);
			}
		} catch (Exception error) {
			System.out.println("Falha na leitura do arquivo. " + error.getMessage());
		}
	}
}
