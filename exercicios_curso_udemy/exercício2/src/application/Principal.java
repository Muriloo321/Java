package application;

import java.util.Scanner;

import entities.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun = new Funcionario();
		System.out.print("Nome: ");
			fun.name = sc.nextLine();
		System.out.print("Salário Bruto: ");
			fun.salariobruto = sc.nextDouble();
		System.out.print("Imposto: ");
			fun.imposto = sc.nextDouble();
			
		System.out.println("Funcionário: "+fun);
		System.out.println();
		System.out.print("Em quanto % aumentar o salário? ");
			fun.aumentarsalario(sc.nextDouble());
		System.out.println();
		System.out.println("Dados Atualizados: "+fun);
	}

}
