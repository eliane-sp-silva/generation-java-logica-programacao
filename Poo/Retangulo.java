package Poo;

public class Retangulo extends BaseFigura implements Figuras {
	
	public Retangulo(double lado1,double lado2,String nome) {
		super(lado1,lado2,nome);
		nomeClasse = "Ret�ngulo";
	}
	@Override
	public double getDiagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt((Math.pow(lado1,2)+ Math.pow(lado2,2)));
	}

}
