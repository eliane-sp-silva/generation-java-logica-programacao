package PooPolimorfismo;

public class AnimalTeste {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Bob", 3);
		Cavalo alado = new Cavalo("Cavalo de Fogo", 10);
		Preguica preg = new Preguica("Soneca", 5);
		
		Animal animal = null; 
		
		int n = (int) (Math.random()*3.0); 
		
		System.out.println("O número escolhido foi: "+n);
		
		switch (n) {
		case 0:	animal = dog; break;
		case 1:	animal = alado;break;
		case 2:	animal = preg;break;
		default: System.out.println("Erro inesperado!"); break;
		}
		
		if (animal != null) {
			animal.emiteSom();
			animal.movimenta();
			animal.imprimirInfo();
		}

	}

}
