package entities;

public class ProgressaoAritmetica {

	public double primeiroTermo;
	public double razao;
	public double termoAtual;
	
	public double proximoTermo () {
		return termoAtual += razao;
	}
}
