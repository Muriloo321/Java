package entities;

public class Pessoa {

	private String nome;
	private String email;
	private int quarto;
	
	public Pessoa(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getQuarto() {
		return quarto;
	}	
}
