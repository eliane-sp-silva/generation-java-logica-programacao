package Poo;

public class TelefonePublico extends Telefone {

	public TelefonePublico() {
		super("Público");


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
			System.out.println("Este telefone não liga para celular!");
			//charAt - pega somente um caracter, lê string como vetor
		}
		
	}
	
	
}
