package classes;

public class Product {
	private String description;
	private double price;
	private int stock;

	public Product() {

	}

	public Product(String description, double price, int stock) {
		this.description = description;
		this.price = price;
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
