package entities;

import java.util.Random;
import java.util.Scanner;

public class Conta {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
		public double saldo;
		public String nomecorrentista;
		public int numeroconta = rand.nextInt(100000, 999999);
		
		public void menu() {
			System.out.println("Menu da conta bancária de "+nomecorrentista+"\n 1- Depósito \n 2- Saque \n 3- Consultar Saldo \n Pressione qualquer outro número para sair da aplicação.");
			int escolha = sc.nextInt(), deposito, saque;
			
			switch(escolha) {
			case 1: System.out.print("Digite quanto você pretende depositar: ");
					deposito = sc.nextInt();
					saldo += deposito;
					menu();
					break;
			case 2: System.out.print("Digite quanto você pretende sacar: ");
					saque = sc.nextInt();
					if(saque > saldo) {
						System.out.println();
						System.out.println("Saldo insuficiente.");
						System.out.println();
						menu();
					}
					saldo -= saque;
					menu();
					break;
			case 3: System.out.println();
					System.out.println("Nome do correntista: "+nomecorrentista);
					System.out.println("Número da conta: "+numeroconta);
					System.out.println("Saldo: "+saldo);
					System.out.println();
					menu();
					break;
			default:System.out.println(); 
					System.out.println("Saindo da aplicação.");  
}
		}
		
}
