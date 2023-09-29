package tuan4.BaiTH;

public class OderDetail {
	private int quantity;
	private Product product;
	
	public double calcTotalPrice() {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		return "OderDetail [quantity=" + quantity + ", product=" + product + "]";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public OderDetail(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	
	

}
