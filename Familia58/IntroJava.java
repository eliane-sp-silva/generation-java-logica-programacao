package Familia58;

import java.util.Scanner;

public class IntroJava {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		float n3;
		double media;
		int op;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: "); //6
		n1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: "); //6
		n2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: "); //6
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("M�dia Aritm�tica: "+media);
		System.out.printf("M�dia Aritm�tica: %.2f",media);
		
		if (media>=7 && media<=10) {
			System.out.println("Aluna aprovada!");
		}else if (media>=5 && media<7) {
			System.out.println("Aluna Exame!");
		}else {
			System.out.println("Aluna reprovada!");
		}
		
		System.out.println("Menu de incentivos: ");
		System.out.println("[1] - Voc� vai aprender!");
		System.out.println("[2] - J� deu certo!");
		System.out.println("[3] - Vai dar bom!");
		System.out.println("[4] - Com dedica��o voc�s v�o al�m!");
		System.out.println("Digite sua op��o: ");
		op=leia.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("Voc� vai aprender!");
			break;
		case 2:
			System.out.println("J� deu certo!");
			break;
		case 3:
			System.out.println("Vai dar bom!");
			break;
		case 4:
			System.out.println("Com dedica��o voc�s v�o al�m!");
			break;
			default:
				System.out.println("Op��o inv�lida!");
		}
		
		//raiz quadrada
		n1 = Math.sqrt(n2);
		//potencia
		n2 = Math.pow(n3, 4);
		
		

	}

}
