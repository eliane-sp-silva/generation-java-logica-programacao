package Poo;

public class Pessoa {
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	public Pessoa(String nome,String endereco,String cpf,int telefone,int idade) {

		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	private void validarCpf() {
	
		if (getCpf().length()!=11) {//contar qtos caracteres tem no método getCpf
			System.out.println("CPF Inválido!");
		}else {
			System.out.println("CPF válido!");
		}

	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
