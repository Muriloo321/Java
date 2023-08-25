package entities;

public class Aluno {

		public int matricula;
		public String nome;
		public double nota1;
		public double nota2;
		public double notatrab;
		
		public double media() {
			return ((nota1*2.5)+(nota2*2.5)+(notatrab*2))/(2.5+2.5+2);
		}
		public double fiinal() {
			if(media()>=4) {
				return 0;
			}
			else {
				return 4-media();
			}
		}
}
