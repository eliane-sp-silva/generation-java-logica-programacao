package Familia58;

import java.util.Scanner;

public class Exerc3Lista6Vetor {

	public static void main(String[] args) {
		/*3- Leia uma matriz 3 x 3, conte e escreva quantos 
		 * valores maiores que 10 ela possui.*/ 
		int [][] matriz = new int [3][3];
		int maiorQue10=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				
				System.out.println("Digite um número: ");
				matriz[linha][coluna] = leia.nextInt();
				
				if (matriz[linha][coluna] > 10) {
					maiorQue10++;
				}
			}
		}
		System.out.println("Valores Maiores que 10: "+maiorQue10+" números;");
		leia.close();
	}

}
