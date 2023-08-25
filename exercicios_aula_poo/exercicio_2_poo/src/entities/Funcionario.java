package entities;

public class Funcionario {

	public String name;
	public int funcao;
	public double salario;
	
	public double ajustaSalario(double salario) {
		return salario += salario/20;
		
	}
}
