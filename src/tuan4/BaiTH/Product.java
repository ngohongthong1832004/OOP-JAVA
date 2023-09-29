package tuan4.BaiTH;

public class Product {
	private String description;
	private String productID;
	private double price;
	
	
	@Override
	public String toString() {
		return "Product [description=" + description + ", productID=" + productID + ", price=" + price + "]";
	}


	public Product(String description, String productID, double price) {
		super();
		this.description = description;
		this.productID = productID;
		this.price = price;
	}
	public Product() {}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getProductID() {
		return productID;
	}


	public void setProductID(String productID) {
		this.productID = productID;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	};
	
	
	
}
