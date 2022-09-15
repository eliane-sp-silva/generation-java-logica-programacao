package Poo;

public class Preguica extends Animal{
	public Preguica(String nome,int idade) {
		super(nome,idade);
	}
	
	public void emitirSom() {
		System.out.println("Preguica emitindo som");

	}
	public void subirArvore() {
		System.out.println("Preguica subindo em árvore");

	}
	public void imprimirInfo() {
		System.out.println("Nome do Animal: "+getNome()+" Idade: "+getIdade()+" anos.");

	}
}
