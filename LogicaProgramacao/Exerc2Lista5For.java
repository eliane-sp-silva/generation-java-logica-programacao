package LogicaProgramacao;

import java.util.Scanner;

public class Exerc2Lista5For {

	public static void main(String[] args) {
		/*
		 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */

		float num;
		int contPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um num�ro: ");
			num = leia.nextFloat();
			
			if (num % 2 == 0) {
				//contPar - soma qtde de numeros
				contPar++;
				
			}else {
				contImpar++;
			}
		}
		
		System.out.println("Qtde de Pares: "+contPar);
		System.out.println("Qtde de �mpares: "+contImpar);
		leia.close();
	}

}
