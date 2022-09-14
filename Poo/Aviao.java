package Poo;

public class Aviao {
	
	private String linhaAerea;
	private String porteAviao;
	private int qtdeAssento;
	private String modelo;
	private int ano;
	
	public Aviao(String linhaAerea,String porteAviao,int qtdeAssento,String modelo,int ano) 
	{
		this.linhaAerea = linhaAerea;
		this.porteAviao = porteAviao;
		this.qtdeAssento = qtdeAssento;
		this.modelo = modelo;
		this.ano = ano;
	}
	

	public String getLinhaAerea() {
		return linhaAerea;
	}


	public void setLinhaAerea(String linhaAerea) {
		this.linhaAerea = linhaAerea;
	}


	public String getPorteAviao() {
		return porteAviao;
	}

	public int getQtdeAssento() {
		return qtdeAssento;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setPorteAviao(String porteAviao) {
		this.porteAviao = porteAviao;
	}

	public void setQtdeAssento(int qtdeAssento) {
		this.qtdeAssento = qtdeAssento;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public void imprimirInfo()
	{
		System.out.println("Linha Aérea: "+linhaAerea+" Porte do Avião: "+porteAviao+" Quantidade de assentos: "+qtdeAssento+" Modelo: "+modelo+" Ano: "+ano);
	}
	
}
