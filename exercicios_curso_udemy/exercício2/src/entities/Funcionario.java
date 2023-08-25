package entities;

public class Funcionario {

	public String name;
	public double salariobruto;
	public double imposto;
	
	public double salarioliquido() {
		return salariobruto - imposto;
	}
	public void aumentarsalario(double porcentagem){
		salariobruto += salariobruto * porcentagem / 100; 
	}
	public String toString() {
		return name + ", $" + salarioliquido();
	}
}

