package Familia58;

import java.util.Scanner;

public class Exerc2Lista4 {

	public static void main(String[] args) {
		//2- Faça um programa que entre com três números e coloque em ordem crescente.

		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		if (a<=b && b<=c) {
			System.out.println("Ordem crescente é: "+a+" , "+b+" , "+c);	
		} else if (a<=c && c<=b) {
			System.out.println("Ordem crescente é: "+a+" , "+c+" , "+b);
		} else if (b<=a && a<=c) {
			System.out.println("Ordem crescente é: "+b+" , "+a+" , "+c);
		}else if (b<=c && c<=a) {
			System.out.println("Ordem crescente é: "+b+" , "+c+" , "+a);
		}else if (c<=a && a<=c) {
			System.out.println("Ordem crescente é: "+c+" , "+a+" , "+b);
		}else {
			System.out.println("Ordem crescente é: "+c+" , "+b+" , "+a);
		}
		
				
		
		leia.close();
	}

}
