package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas: ");
			int n = sc.nextInt();
			
		Pessoa[] vect = new Pessoa[n];
		for(int i = 0; i<vect.length; i++){
			sc.nextLine();
			System.out.println("Dados da "+(i+1)+"°"+" pessoa: ");
			System.out.print("Nome : ");
				String nome = sc.nextLine();
			System.out.print("Idade : ");
				int idade = sc.nextInt();
			System.out.print("Altura : ");
				double altura = sc.nextDouble();
				
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		double soma = 0;
		for(int i = 0; i<vect.length; i++) {
			soma += vect[i].getAltura();
		}
		
		double altMedia = soma/vect.length;
		System.out.printf("Altura média = %.2f%n", altMedia);
		
		double iddMenor = 0;
		for(int i = 0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				iddMenor++;
			}
		}
		
		double porcentagem = (iddMenor/vect.length)*100;
		System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%n",porcentagem);
		
		System.out.println("Pessoas menores de 16 anos: ");
		for(int i = 0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());;
			}
		}
	}
}
