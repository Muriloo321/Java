package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order(){
		
	}

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}


	public LocalDateTime getMoment() {
	    return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem (OrderItem item) {
		items.add(item);
	}
	
	public void removeItem (OrderItem item) {
		items.remove(item);
	}
	
	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double total() {
		double sum = 0;
		for(OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
}
