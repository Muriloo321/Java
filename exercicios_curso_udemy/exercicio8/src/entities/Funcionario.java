package entities;

public class Funcionario {

	private String nome;
	private int id;
	private double salario;
	
	public Funcionario(String nome, int id, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario "+nome+", ID "+ id +", Salário = R$"+salario;
	}
	
	
	
}
