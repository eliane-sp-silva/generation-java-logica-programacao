package LogicaProgramacao;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		float numeros;
		// TODO Auto-generated method stub
		int contPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numéro: ");
		System.out.println("Digite primeira nota: ");
		numeros = leia.nextFloat();
		
		while (numeros != -99) {
			if (numeros % 2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
			System.out.println("Digite um número: ");
			
		}
	}

}
