package application;

import java.util.Scanner;

import entities.Aluno;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno alu = new Aluno();
		System.out.print("Digite o nome do aluno: ");
			alu.nome = sc.nextLine();
		System.out.println("Digite as três notas do aluno (de 0 a 30 para o primeiro semestre e de 0 a 35 para os outros dois)");
			alu.nota1 = sc.nextDouble();
			alu.nota2 = sc.nextDouble();
			alu.nota3 = sc.nextDouble();
		System.out.println("NOTA FINAL = "+alu.resultadofinal());
		if(alu.resultadofinal() >= 60) {
			System.out.println("PASSOU");
		}
		else {
			System.out.println("PERDEU");
			System.out.println("PONTOS FALTANDO: "+alu.pontosfaltando());
		}		
		sc.close();
	}

}
