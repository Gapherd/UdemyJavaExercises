package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

//ATTRIBUTES
	private Date moment;
	private OrderStatus status;
	//COMPOSITION
		private Client client;
		private List<OrderItem> items = new ArrayList<OrderItem>();
		
//CONSTRUCTOR
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Order(Date moment, OrderStatus status, Client client, OrderItem item) {
		this.moment = moment;
		this.status = status;
		this.client = client;
		items.add(item);
	}
		
//GETS & SETS
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
//METHODS
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double total = 0;
		
		for(OrderItem o : items) {
			total += o.subTotal();
		}
		
		return total;
	}

	@Override
	public String toString() {
		StringBuilder data = new StringBuilder("ORDER SUMMARY \n");
			data.append("Order moment: " + moment +"\n");
			data.append("Order status: " + status + "\n");
			data.append("Client: " + client + "\n");
		data.append("Order items: \n");
			for(OrderItem o : items) {
				data.append(o + "\n");
			}
		data.append("Total price: $"+String.format("%.2f", total()));
			
		return data.toString();
	}
		

	
	
}
