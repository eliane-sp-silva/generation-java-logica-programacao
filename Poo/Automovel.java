package Poo;
//defini��o da classe Autom�vel
public class Automovel {

	//declara��o dos atributos da classe 
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	public Automovel(String nomeProprietario, String modelo,String placa,int ano)
	{
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	//declara��o dos demais m�todos da classe	
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public int getAno() {
		return ano;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public void imprimirInfo()
	{
		System.out.println(nomeProprietario+" possui um ve�culo de modelo: "+modelo+
				" com placa: "+placa+" e ano: "+ano);
	}
	
}
