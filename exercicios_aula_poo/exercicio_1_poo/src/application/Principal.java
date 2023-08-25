package application;

import java.util.Scanner;

import entities.ProgressaoAritmetica;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProgressaoAritmetica T = new ProgressaoAritmetica();
		
		System.out.print("Digite o primeiro termo: ");
			T.primeiroTermo = sc.nextDouble();
		System.out.print("Digite a razao: ");
			T.razao = sc.nextDouble();
			T.termoAtual = T.primeiroTermo;
		System.out.print("Digite o número de termos: ");
			int n = sc.nextInt();
			System.out.println(T.termoAtual);
			for(int i=0; i<n-1; i++) {
			System.out.println(T.proximoTermo());
		}
		
	}

}
