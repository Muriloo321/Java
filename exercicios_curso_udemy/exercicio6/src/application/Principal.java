package application;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
			int n = sc.nextInt();
			if(n > 10 || n < 1) {
				System.out.println("Mínimo 1 máximo 10");
				sc.close();
			}
			
		int[] nmrInt = new int[n];
		
		for(int i=0; i<nmrInt.length; i++) {
			int nmr;
			System.out.print("Digite um número: ");
			nmr = sc.nextInt();
			nmrInt[i] = nmr;
		}
		System.out.println("NÚMEROS NEGATIVOS: ");
		for(int i = 0; i<nmrInt.length; i++) {
			if(nmrInt[i] < 0) {
				System.out.println(nmrInt[i]);
			}
		}
		
	}

}
