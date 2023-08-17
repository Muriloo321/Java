package application;

import java.util.Scanner;

import entities.Retangulo;

public class Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		System.out.println("Digite a largura e altura, respectivamente, de um retângulo: ");
			ret.width = sc.nextDouble();
			ret.height = sc.nextDouble();
		System.out.printf("AREA = %.2f%n",ret.area());
		System.out.printf("PERIMETRO = %.2f%n",ret.perimeter());
		System.out.printf("DIAGONAL = %.2f%n",ret.diagonal());
	}

}
