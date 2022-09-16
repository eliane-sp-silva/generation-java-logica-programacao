package Poo;

public class TelefoneCelular extends Telefone {//criando herança
	
	public TelefoneCelular() //criando construtor
	{
		super("Celular");
	}
	
	@Override //indica um método polimorfico - sobrescreve o método abstrato
	public void toca(int codigoToque) //implementando método abstrato
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
		System.out.println("\nO número: "+numero+" é um celular...");
	}

	
}
