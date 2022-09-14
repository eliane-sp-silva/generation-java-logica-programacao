package Poo;

public class AviaoTeste {

	public static void main(String[] args) {
		
	Aviao aviao1 = new Aviao("Dreams Linhas Aéreas","Porte Médio",100,"JEVK",2022);	
	Aviao aviao2 = new Aviao("Boa Viagem Linhas Aéreas","Porte Grande",300,"JK07",2021);
	
	System.out.println("*** Histórico de alterações | Aviões ***");
	System.out.println("\n");
	aviao1.imprimirInfo();
	aviao1.setModelo("JJ07");
	System.out.println("Modelo alterado para: "+aviao1.getModelo());
	aviao1.imprimirInfo();	
	System.out.println("\n");
	aviao2.imprimirInfo();
	aviao2.setLinhaAerea("BlueSky Linhas Aéreas");
	System.out.println("Nome de Linha Aérea alterado para: "+aviao2.getLinhaAerea());
	aviao2.imprimirInfo();
	
	
	
	}

}
