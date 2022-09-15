package Poo;

public class Cachorro extends Animal {

	public Cachorro(String nome,int idade) {
		super(nome,idade);
	}
	
	public void emitirSom() {
		System.out.println("Cachorro latindo");

	}
	public void correr() {
		System.out.println("Cachorro correndo");

	}
	public void imprimirInfo() {
		System.out.println("Nome do Animal: "+getNome()+" Idade: "+getIdade()+" anos.");

	}
}
