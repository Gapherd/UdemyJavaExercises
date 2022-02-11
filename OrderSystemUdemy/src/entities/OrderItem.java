package entities;

public class OrderItem {
	
//ATTRIBUTES
	private int quantity;
	private double price;
		//COMPOSITION
		private Product product;
	
//CONSTRUCTORS
	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
//GETS & SETS
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
//METHODS
	public double subTotal() {
		return quantity * price;
	}
	
	public String toString() {
		return product.getName() +", Quantity: "+quantity+", Subtotal: $"+String.format("%.2f", subTotal());
	}

}
