package LogicaProgramacao;

import java.util.Scanner;

public class Exerc4Lista4 {

	public static void main(String[] args) {
		/*
		 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
			número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
			ímpar exiba o número elevado ao quadrado.*/
		int num;
		double res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
			//raiz quadrada do mesmo
			res = Math.sqrt(num);
		}else {
			//número elevado ao quadrado
			res = Math.pow(num, 2);
		}
		
		System.out.println("Resultado é: "+res);
		
		leia.close();
	}

}
