package Poo;

public class AviaoTeste {

	public static void main(String[] args) {
		
	Aviao aviao1 = new Aviao("Dreams Linhas A�reas","Porte M�dio",100,"JEVK",2022);	
	Aviao aviao2 = new Aviao("Boa Viagem Linhas A�reas","Porte Grande",300,"JK07",2021);
	
	System.out.println("*** Hist�rico de altera��es | Avi�es ***");
	System.out.println("\n");
	aviao1.imprimirInfo();
	aviao1.setModelo("JJ07");
	System.out.println("Modelo alterado para: "+aviao1.getModelo());
	aviao1.imprimirInfo();	
	System.out.println("\n");
	aviao2.imprimirInfo();
	aviao2.setLinhaAerea("BlueSky Linhas A�reas");
	System.out.println("Nome de Linha A�rea alterado para: "+aviao2.getLinhaAerea());
	aviao2.imprimirInfo();
	
	
	
	}

}
