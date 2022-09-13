package Familia58;

import java.util.Scanner;

public class Exerc2Lista6Vetor {

	public static void main(String[] args) {
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		 * ->Os n�meros pares digitados; 
		 * ->A soma dos n�meros pares digitados; 
		 * ->Os n�meros �mpares digitados;
		 * ->A quantidade de n�meros �mpares digitados.
		 */

		int[] num = new int[6];
		int[] paresDigitados = new int[6];
		int somaPares = 0, qtdeImpares = 0;

		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.println("Digite um n�mero: ");
			num[i] = leia.nextInt();
			
			if (num[i] % 2 == 0) {
				paresDigitados[i] = num[i];
				somaPares += num[i];
				
			} else {
				qtdeImpares++;
			}
			
		}		
		for (int i = 0; i < 6; i++) {
			System.out.println("Par digitado: "+"num["+(i+1)+"]"+" = "+paresDigitados[i]);
		}		
		
		System.out.println("\nA soma dos n�meros pares digitados: " + somaPares);
		System.out.println("A quantidade de n�meros �mpares digitados: " + qtdeImpares);		

		leia.close();
	}

}
