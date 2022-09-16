package PooPolimorfismo;

public abstract class Animal {	

	private String nome;
	private int idade;
	
	abstract public void emiteSom();
	abstract public void movimenta();
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void imprimirInfo() {
		System.out.println("Nome do Animal: "+getNome()+" Idade: "+getIdade()+" anos.");
		
	}

	
	
}
