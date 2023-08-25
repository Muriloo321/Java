package application;

import java.util.Random;
import java.util.Scanner;

import entities.Aluno;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		Aluno alu1, alu2, alu3;
		alu1 = new Aluno();
		alu2 = new Aluno();
		alu3 = new Aluno();
		System.out.println("Digite o nome de três alunos, para que suas matrículas sejam processadas!");
		 	alu1.nome = sc.nextLine();
		 	alu2.nome = sc.nextLine();
		 	alu3.nome = sc.nextLine();
	 	alu1.matricula = rand.nextInt(000000000, 999999999);
	 	alu2.matricula = rand.nextInt(000000000, 999999999);
	 	alu3.matricula = rand.nextInt(000000000, 999999999);
	 	System.out.println();
	 	System.out.println(alu1.nome+" Matrícula: "+alu1.matricula);
	 	System.out.println(alu2.nome+" Matrícula: "+alu2.matricula);
	 	System.out.println(alu3.nome+" Matrícula: "+alu3.matricula);
	 	System.out.println();
	 	System.out.println("Digite as três notas de "+alu1.nome);
	 		alu1.nota1 = sc.nextDouble();
	 		alu1.nota2 = sc.nextDouble();
	 		alu1.notatrab = sc.nextDouble();
 		System.out.println("Digite as três notas de "+alu2.nome);
	 		alu2.nota1 = sc.nextDouble();
	 		alu2.nota2 = sc.nextDouble();
	 		alu2.notatrab = sc.nextDouble();	
 		System.out.println("Digite as três notas de "+alu3.nome);
	 		alu3.nota1 = sc.nextDouble();
	 		alu3.nota2 = sc.nextDouble();
	 		alu3.notatrab = sc.nextDouble();
	 	System.out.println();
 		System.out.println(alu1.nome+" Matrícula: "+alu1.matricula); 		
	 	System.out.printf("Média: %.2f%n",alu1.media());
	 	System.out.printf("Pontos para ir à prova final: %.2f%n",alu1.fiinal());
	 	System.out.println();
		System.out.println(alu2.nome+" Matrícula: "+alu2.matricula); 		
	 	System.out.printf("Média: %.2f%n",alu2.media());
	 	System.out.printf("Pontos para ir à prova final: %.2f%n",alu2.fiinal());
	 	System.out.println();
		System.out.println(alu3.nome+" Matrícula: "+alu3.matricula); 		
	 	System.out.printf("Média: %.2f%n",alu3.media());
	 	System.out.printf("Pontos para ir à prova final: %.2f%n",alu3.fiinal());
	}

}
