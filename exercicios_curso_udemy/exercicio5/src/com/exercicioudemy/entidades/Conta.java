package com.exercicioudemy.entidades;

public class Conta {

	private int numeroConta;
	private String nomeTitular;
	private double depositoInicial;
	
	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.depositoInicial = depositoInicial;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	
	
	
}
