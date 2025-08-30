package aula03ex2;

public class ProgramaDasFiguras {

	public static void main(String[] args) {
		
	   GerenteDeFiguras gerente = new GerenteDeFiguras();

	   Triangulo t1 = new Triangulo(2.0, 3.0);
	   gerente.adicionaFigura(t1);

	   Losango l1 = new Losango(2.0, 4.0);
	   Losango l2 = new Losango(3.0, 2.0);
	   Losango l3 = new Losango(10.0, 6.0);

	   gerente.adicionaFigura(l1);
	   gerente.adicionaFigura(l2);
	   gerente.adicionaFigura(l3);

	   System.out.println("Figuras cadastradas:");
	   gerente.imprimeFiguras();

	   System.out.println("\nÁrea total: " + gerente.getAreaTotal());

	   System.out.println("Maior área: " + gerente.getMaiorAreaDeFigura());
	    }
}
