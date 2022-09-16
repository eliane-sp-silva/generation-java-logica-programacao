package PooPolimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome,idade);
	}
	
	@Override
	public void emiteSom() {
		System.out.println("Cavalo relinxando");
		
	}
	@Override
	public void movimenta() {
		System.out.println("Cavalo galopando");		
	}
	
}
