package Familia58;

import java.util.Scanner;

public class Exerc1Lista4 {

	public static void main(String[] args) {
		// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int num1, num2, num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("Digite segundo numero: ");
		num2 = leia.nextInt();
		System.out.println("Digite terceiro numero: ");
		num3 = leia.nextInt();
		
		if (num1>num2 && num1>num3 ) {
			System.out.println("O maior valor �: "+num1);
			
		}else if (num2 >num3) {
			System.out.println("O maior valor �: "+num2);
		} 
		else {
			System.out.println("O maior valor �: "+num3);
			
		}

	}

}
