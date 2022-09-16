package Poo;

public class TelefoneFixo extends Telefone{

	public TelefoneFixo()
	{
		super("Fixo");
	}
	
	@Override
	public void toca(int numToques) {

		for (int i = 0; i < numToques; i++) { //qtde de vezes que vai tocar
			System.out.println("\n");
		}		
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("Discando: "+numero);
		
	}
	

	
}
