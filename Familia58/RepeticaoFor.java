package Familia58;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3,media,somaMedia=0,mg;
		
		
		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("Digite primeira nota: "); //8,5
			n1 = leia.nextFloat();
			System.out.println("Digite segunda nota: ");//7,4
			n2 = leia.nextFloat();
			System.out.println("Digite terceira nota: ");//9,2
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			//arredondar duas casas para direita
			System.out.printf("Média Aritmética: %.2f",media);
			somaMedia += media;
		}
		
		mg = somaMedia / 3;
			System.out.printf("Média Geral: %.2f",mg);
		
			leia.close();

	}

}
