package Poo;

public class TelefonePublico extends Telefone {

	public TelefonePublico() {
		super("P�blico");


	}
	
	@Override
	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("Piririnpiririnnn...");
		}
		
	}
	
	@Override
	public void disca(String numero) {
		if (numero.charAt(0)=='9' || numero.charAt(0)=='8') {
			System.out.println("Este telefone n�o liga para celular!");
			//charAt - pega somente um caracter, l� string como vetor
		}
		
	}
	
	
}
