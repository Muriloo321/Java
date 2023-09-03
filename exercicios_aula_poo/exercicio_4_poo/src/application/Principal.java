package application;

import java.util.Scanner;

import entities.Conta;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta co = new Conta();
		
		System.out.print("Digite o nome do correntista: ");
			co.nomecorrentista = sc.nextLine();
		System.out.print("Digite o saldo da conta: ");
			co.saldo = sc.nextDouble();
		co.menu();
	}
}
