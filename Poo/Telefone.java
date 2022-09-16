package Poo;

public abstract class Telefone {
	
	private String tipo;
	
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	//os detalhes dos m�todos abstratos ser�o detalhados
	//nas classes implementadas.
	
	public Telefone(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
