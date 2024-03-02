package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
			String nome = sc.nextLine();
		System.out.print("Email: ");
			String email = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY): ");
			String datanasc = sc.next();
		  	LocalDate nascimento = LocalDate.parse(datanasc, fmt1); 
	  	System.out.println("Enter order data:");
	  	System.out.print("Status: ");
	  		String orderStatus = sc.next();
		  	
	  	Order order = new Order(OrderStatus.valueOf(orderStatus), new Client(nome, email, nascimento));

	  	System.out.print("How many items to this order? ");
	  		int qntItens = sc.nextInt();
	  		
	  		for(int i=0; i<qntItens; i++) {
	  			System.out.println("Enter #"+(i+1)+" item data:");
	  			sc.nextLine();
	  			System.out.print("Product name: ");
	  				String nomeProduto = sc.nextLine();
  				System.out.print("Product price: ");
  					double precoProduto = sc.nextDouble();
				System.out.print("Quantity: ");
					int qtdProduto = sc.nextInt();
					
				Product product = new Product(nomeProduto, precoProduto);
				
				OrderItem itemOrdem = new OrderItem(qtdProduto, precoProduto, product);
				
				order.addItem(itemOrdem);
	  		}
	  		
	  		System.out.println("ORDER SUMMARY");
	  		System.out.println("Order moment: "+order.getMoment().now().format(fmt2));
	  		System.out.println("Order status: "+order.getStatus());
	  		System.out.println(order.getClient());
	  		System.out.println("Order items: ");
	  		double total = 0;
	  		for(OrderItem or : order.getItems()) {
	  			System.out.println(or);
	  			total += or.subTotal();
	  		}
	  		
	  		System.out.println("Total price: "+total);
	  		
		sc.close();
	}

}
