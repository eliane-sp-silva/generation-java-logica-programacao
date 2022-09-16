package Poo;

public class TelefoneTest {

	public static void main(String[] args) {
		TelefoneCelular celular = new TelefoneCelular();
		TelefoneFixo fixo = new TelefoneFixo();
		TelefonePublico publico = new TelefonePublico();
		
		Telefone telefone = null; //criou variavel tipo telefone
		
		int n = (int) (Math.random()*3.0); //pega a parte inteira e sorteia
		
		System.out.println("O número escolhido foi: "+n);
		
		switch (n) {
		case 0:	telefone = celular; break;
		case 1:	telefone = fixo;break;
		case 2:	telefone = publico;break;
		default: System.out.println("Erro inesperado!"); break;
		}
		
		if (telefone != null) {
			telefone.disca("92324544");
			telefone.toca(2);
		}



	}

}
