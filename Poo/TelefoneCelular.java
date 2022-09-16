package Poo;

public class TelefoneCelular extends Telefone {//criando heran�a
	
	public TelefoneCelular() //criando construtor
	{
		super("Celular");
	}
	
	@Override //indica um m�todo polimorfico - sobrescreve o m�todo abstrato
	public void toca(int codigoToque) //implementando m�todo abstrato
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("Trimmm...trimmm");
			break;
		case 2:
			System.out.println("Plinnn...plinn...");
			break;
			default:
				System.out.println("Trummm...trummm");
		}
	}
	
	public void disca(String numero)
	{
		System.out.println("\nO n�mero: "+numero+" � um celular...");
	}

	
}
