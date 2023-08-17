package application;

import java.util.Scanner;

import utilitarios.CurrencyConverter;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Qual é o valór do dólar? ");
			double dolar = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
			double quantidade = sc.nextDouble();
		System.out.println("Quantidade paga em reais = "+CurrencyConverter.conversor(dolar, quantidade));
		
		sc.close();
	}

}
