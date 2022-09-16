package PooPolimorfismo;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome,idade);
	}
	
	@Override
	public void emiteSom() {
		System.out.println("Preguica emitindo som");
		
	}
	
	@Override
	public void movimenta() {
		System.out.println("Preguica subindo em árvore");		
	}	

	
}
