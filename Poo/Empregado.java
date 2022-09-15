package Poo;

import java.text.NumberFormat;

public class Empregado {
	
	private String nome;
	private double salario;
	
	public Empregado(String n, double s) {
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual/100;
	}
	public String formatarMoeda()
	{	//coloca moeda do país
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		numberFormat.setMinimumFractionDigits(2);//método indica qtde casas
		String formatoMoeda = numberFormat.format(salario);//formata o salário
		return formatoMoeda; //variável que guarda salário formatado.
	}
		
	public void imprimir()
	{
		System.out.println("Nome: "+nome+"\t\tSalário: "+this.formatarMoeda());
	}
	
}
