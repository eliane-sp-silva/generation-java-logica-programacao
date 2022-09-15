package Poo;

public class Cavalo extends Animal{

	public Cavalo(String nome,int idade) {
		super(nome,idade);
	}
	
	public void emitirSom() {
		System.out.println("Cavalo relinxando");

	}
	public void correr() {
		System.out.println("Cavalo galopando");

	}
	public void imprimirInfo() {
		System.out.println("Nome do Animal: "+getNome()+" Idade: "+getIdade()+" anos.");

	}
}
