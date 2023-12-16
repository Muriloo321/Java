package com.exercicioudemy;

import java.util.Scanner;

import com.exercicioudemy.entidades.Conta;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
			int numConta = sc.nextInt();
		
		System.out.print("Digite o nome do dono da conta: ");
			sc.nextLine();
			String nomConta = sc.nextLine();
		
		System.out.println("Você irá ter um depósito inicial (s/n)?");
			char decisaoDep = sc.next().charAt(0);
			double depositoInicial = 0; 
		
		if(decisaoDep == 's' || decisaoDep == 'S') {
			System.out.print("Digite o depósito inicial: ");
			depositoInicial = sc.nextDouble();
		}
		
		Conta conta = new Conta(numConta, nomConta, depositoInicial);
		System.out.println();
		System.out.println("Informações da Conta: ");
		System.out.println("Conta: "+conta.getNumeroConta()+", Usuário: "+conta.getNomeTitular()+", Saldo: "+conta.getDepositoInicial());
		
		System.out.println();

		System.out.print("Digite um valor de depósito: ");
			double valorDeposito = sc.nextDouble();
			conta.setDepositoInicial(conta.getDepositoInicial() + valorDeposito);
			
		System.out.println("Informações Atualizadas da Conta: ");
		System.out.println("Conta: "+conta.getNumeroConta()+", Usuário: "+conta.getNomeTitular()+", Saldo: "+conta.getDepositoInicial());
		
		System.out.println();
		
		System.out.print("Digite um valor de saque : ");
		double valorSaque = sc.nextDouble();
		conta.setDepositoInicial((conta.getDepositoInicial() - valorSaque)-5);
		
		System.out.println("Informações Atualizadas da Conta: ");
		System.out.println("Conta: "+conta.getNumeroConta()+", Usuário: "+conta.getNomeTitular()+", Saldo: "+conta.getDepositoInicial());
	}

}
