package LogicaProgramacao;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numero = new int [2][3];
		
		int somaNumero=0,linha,coluna,somaDiagonal=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++) {
			
			for (coluna = 0; coluna < 3; coluna++) {
				
				System.out.println("Digite um n�mero na linha: "+linha+" e coluna: "+coluna+" : ");				
				numero[linha][coluna] = leia.nextInt();
				
								
				if (numero[linha][coluna] > 0) {
					
					somaNumero += numero[linha][coluna];
				}
				
				//diagonal 
				if (linha == coluna) {
					somaDiagonal += numero[linha][coluna] ;
				}
			}
		}
		System.out.println("Somat�rio dos n�meros maiores que ZERO: "+somaNumero);
		System.out.println("Somat�rio dos n�meros maiores que ZERO: "+somaDiagonal);
		
		leia.close();
	}

}
