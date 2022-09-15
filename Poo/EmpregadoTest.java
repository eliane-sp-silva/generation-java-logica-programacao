package Poo;

public class EmpregadoTest {

	public static void main(String[] args) {

		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Letícia Santos",25000);
		lista[1] = new Empregado("Hellen Digramont",15000);
		lista[2] = new Empregado("Isabel",45750);
		
		System.out.println("*****************************************************");
		for (Empregado roda : lista) {
			roda.imprimir();
		}
		
		System.out.println("*****************************************************");
		for (Empregado roda : lista) {
			roda.aumentarSalario(20);
			roda.imprimir();
		}
		System.out.println("*****************************************************");

	}

}
