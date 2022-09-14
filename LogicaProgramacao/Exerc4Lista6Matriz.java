package LogicaProgramacao;

import java.util.Scanner;

public class Exerc4Lista6Matriz {

	public static void main(String[] args) {
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int valor,op;
		
		Scanner leia = new Scanner(System.in);
		
		
		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {
				//populando as matrizes
				System.out.println("Digite valor da Matriz 1: ");
				matriz1[x][y] = leia.nextFloat();
				System.out.println("Digite valor da Matriz 2: ");
				matriz2[x][y] = leia.nextFloat();
			}
		}
		
		do {
			System.out.println("Menu de Opções: ");
			System.out.println("[1] Somar duas matrizes");
			System.out.println("[2] Subtrair matriz 1 da matriz 2");
			System.out.println("[3] Adicionar uma constante as duas matrizes");
			System.out.println("[4] Imprimir matrizes");
			System.out.println("[0] Sair do programa");
			System.out.println("[4] Digite sua opção: ");
			op = leia.nextInt();
			
		}while(op != 0);
		switch(op) {
		case 1:
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {					
					
					matriz3[x][y] = matriz1[x][y] + matriz2[x][y];
					System.out.println("Soma das matrizes: "+matriz3[x][y]);					
				}
			}
			break;
		case 2:
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {					
					
					matriz3[x][y] = matriz2[x][y] - matriz1[x][y];
					System.out.println("Diferença: "+matriz3[x][y]);					
				}
			}
			break;
		case 3:
			System.out.println("Digite um valor: ");
			valor = leia.nextInt();
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {					
					
					matriz1[x][y] += valor;
					matriz2[x][y] += valor;
					System.out.println("Matriz 1: "+matriz1[x][y]);	
					System.out.println("Matriz 2: "+matriz2[x][y]);
				}
			}
			break;
		case 4: 
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {					
					
					System.out.println("Matriz 1: "+matriz1[x][y]);	
					System.out.println("Matriz 2: "+matriz2[x][y]);
				}
			}
			break;
		case 0:
			System.out.println("Muito obrigada por utilizar nosso programa!");
			break;
			default:
				System.out.println("Opção inválida! Tente novamente!");
		}
		
		leia.close();
	}

}
