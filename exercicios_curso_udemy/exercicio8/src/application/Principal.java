package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos funcionários haverão: ");
			int n = sc.nextInt();
		
		List<Funcionario> lista = new ArrayList<Funcionario>(n);
		
		for(int i=0; i<n; i++) {
			System.out.println("Funcionário N°"+(i+1));
			System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
			System.out.print("ID: ");
				int id = sc.nextInt();
				for (Funcionario funcionario : lista) {
				    if (funcionario.getId() == id) {
				        System.out.println("Não deve haver repetição de ID");
				        System.exit(0);
				    }
				}
			System.out.print("Salário: ");
				double salario = sc.nextDouble();
			lista.add(new Funcionario(nome, id, salario));
		}
		
		System.out.print("Digite o ID do funcionário que irá receber um aumento de salário: ");
			int idSelecionado = sc.nextInt();
			boolean funcionarioEncontrado = false;
			
			for(Funcionario func : lista) { //Nesta parte, era recomendado utilizar o que o professor ensinou (comandos lambda), porém foi brevemente e mal ensinado
				if(func.getId() == idSelecionado) {
					System.out.print("Digite a porcentagem do aumento: ");
						int porc = sc.nextInt();
					func.setSalario(func.getSalario()+(func.getSalario()/porc));
					funcionarioEncontrado = true;
					break;
				}
			}
				
				if(!funcionarioEncontrado) {
					System.out.println("Não existe funcionário com este ID!");
				}
				
		System.out.println();
		System.out.println("Número de funcionários: "+lista.size());
		System.out.println();
		System.out.println("Lista de funcionários: ");
			for(Funcionario func : lista) {
				System.out.println(func);
			}
	}
}
