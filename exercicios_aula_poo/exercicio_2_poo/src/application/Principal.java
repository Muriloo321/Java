package application;

import java.util.Scanner;

import entities.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario(), f2 = new Funcionario(), f3 = new Funcionario(); 
		Funcionario f4 = new Funcionario(), f5 = new Funcionario();
		System.out.println("Digite como desejar os respectivos nomes de 5 funcionários");
			f1.name = sc.nextLine();
			f2.name = sc.nextLine();
			f3.name = sc.nextLine();
			f4.name = sc.nextLine();
			f5.name = sc.nextLine();
		System.out.println("Digite qual a função de cada um destes funcionários (em ordem):");
		System.out.println("1- Programador (Salário de 7.500)");
		System.out.println("2- Gerente (Salário de 11.200");
		System.out.println("3- Analista (Salário de 4.500)");
		System.out.println("Qualquer outro número - Sócio (Salário de 30.000)");
		f1.funcao = sc.nextInt();
		switch(f1.funcao) {
			case 1: System.out.println(f1.name+" é um programador e recebe 7500!" );
					f1.salario = 7500;
					break;
			case 2: System.out.println(f1.name+" é um gerente e recebe 11.200!");
					f1.salario = 11200;
					break;
			case 3: System.out.println(f1.name+" é um analista e recebe 4.500!");
					f1.salario = 4500;
					break;
			default: System.out.println(f1.name+" é um sócio e recebe 30.000!");
					f1.salario = 30000;
					break;		
	}
		f2.funcao = sc.nextInt();
		switch(f2.funcao) {
		case 1: System.out.println(f2.name+" é um programador e recebe 7500!" );
				f2.salario = 7500;
				break;
		case 2: System.out.println(f2.name+" é um gerente e recebe 11.200!");
				f2.salario = 11200;
				break;
		case 3: System.out.println(f2.name+" é um analista e recebe 4.500!");
				f2.salario = 4500;
				break;
		default: System.out.println(f2.name+" é um sócio e recebe 30.000!");
				f2.salario = 30000;
				break;		
	}
		f3.funcao = sc.nextInt();
		switch(f3.funcao) {
		case 1: System.out.println(f3.name+" é um programador e recebe 7500!" );
				f3.salario = 7500;
				break;
		case 2: System.out.println(f3.name+" é um gerente e recebe 11.200!");
				f3.salario = 11200;
				break;
		case 3: System.out.println(f3.name+" é um analista e recebe 4.500!");
				f3.salario = 4500;
				break;
		default: System.out.println(f3.name+" é um sócio e recebe 30.000!");
				f3.salario = 30000;
				break;		
	}
		f4.funcao = sc.nextInt();
		switch(f4.funcao) {
		case 1: System.out.println(f4.name+" é um programador e recebe 7500!" );
				f4.salario = 7500;
				break;
		case 2: System.out.println(f4.name+" é um gerente e recebe 11.200!");
				f4.salario = 11200;
				break;
		case 3: System.out.println(f4.name+" é um analista e recebe 4.500!");
				f4.salario = 4500;
				break;
		default: System.out.println(f4.name+" é um sócio e recebe 30.000!");
				f4.salario = 30000;
				break;		
	}
		f5.funcao = sc.nextInt();
		switch(f5.funcao) {
		case 1: System.out.println(f5.name+" é um programador e recebe 7500!" );
				f5.salario = 7500;
				break;
		case 2: System.out.println(f5.name+" é um gerente e recebe 11.200!");
				f5.salario = 11200;
				break;
		case 3: System.out.println(f5.name+" é um analista e recebe 4.500!");
				f5.salario = 4500;
				break;
		default: System.out.println(f5.name+" é um sócio e recebe 30.000!");
				f5.salario = 30000;
				break;		
	}
		System.out.println();
		System.out.println("Com os reajustes de salário, aqui estão as novas remunerações:");
		System.out.println(f1.name+": "+f1.ajustaSalario(f1.salario));
		System.out.println(f2.name+": "+f2.ajustaSalario(f2.salario));
		System.out.println(f3.name+": "+f3.ajustaSalario(f3.salario));
		System.out.println(f4.name+": "+f4.ajustaSalario(f4.salario));
		System.out.println(f5.name+": "+f5.ajustaSalario(f5.salario));
		

	}

}
