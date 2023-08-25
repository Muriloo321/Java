package utilitarios;

public class CurrencyConverter {

	public static final double IOF = 6.0;
	
	public static double conversor(double dolar, double quantidade) {
		double real = dolar * quantidade;
		return real += real*IOF/100;
		
	}
}
