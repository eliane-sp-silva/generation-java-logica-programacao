package Poo;

public class Quadrado extends BaseFigura implements Figuras{
	
	public Quadrado(double lado,String nome) {
		super(lado, lado, nome);
		nomeClasse = "Quadrado";
	}
	
	@Override
	public double getDiagonal() {		
		return Math.sqrt(2)*lado1;
	}
}
