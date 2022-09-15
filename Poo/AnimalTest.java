package Poo;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Bob", 3);
		Cavalo alado = new Cavalo("Cavalo de Fogo", 10);
		Preguica preg = new Preguica("Soneca", 5);
		
		System.out.println("\n***********************************************");
		dog.imprimirInfo();
		dog.emitirSom();
		dog.correr();
		
		System.out.println("***********************************************\n");
		alado.imprimirInfo();
		alado.emitirSom();
		alado.correr();
		
		System.out.println("***********************************************\n");
		preg.imprimirInfo();
		preg.emitirSom();
		preg.subirArvore();
		
		System.out.println("***********************************************\n");
		
		
	}

}
