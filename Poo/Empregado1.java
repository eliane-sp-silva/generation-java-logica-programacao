package Poo;
//subclasse
public class Empregado1 extends Pessoa{
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado1(String nome,String endereco,String cpf,int telefone,int idade,
			int codigoSetor,float salarioBase,float imposto) {
		//super->indica herança - criando relação de herança
		super(nome,endereco,cpf,telefone,idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome do empregado: "+getNome()+
		" CPF: "+getCpf()+" Idade: "+getIdade()+" Telefone: "+
		getTelefone()+" Endereço: "+getEndereco()+" Código do Setor: "+
		codigoSetor+" Salário Base: "+salarioBase+
		" Valor em porcentagem(sem o %) de imposto a ser retido do salário: "+imposto);
	}
	
	public void calcularSalario() {
		double salarioTotal = salarioBase - (salarioBase * (imposto/100));
		System.out.println("O salário total a ser recebido pelo empregado -- "+getNome()+
		" é igual a "+salarioTotal);

	}

}
