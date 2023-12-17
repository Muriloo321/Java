package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos estudantes irão alugar quartos? ");
			int n = sc.nextInt();
			
		Pessoa[] estudante = new Pessoa[10];
		
		for(int i=0; i<n; i++) {
			
			sc.nextLine();
			System.out.println("Aluguel #"+(i+1)+":");
			
			System.out.print("Nome: ");
				String nome = sc.nextLine();
			System.out.print("E-mail: ");
				String email = sc.next();
			System.out.print("Quarto: ");
				int quarto = sc.nextInt();
			
			estudante[quarto] = new Pessoa(nome, email, quarto);
		}
		
		System.out.println("Quartos ocupados: ");
		for(int i=0; i<estudante.length; i++) {
			if(estudante[i]!=null) {
				System.out.println(estudante[i].getQuarto()+": "+estudante[i].getNome()+", "+estudante[i].getEmail());
			}
		}
	}
}
