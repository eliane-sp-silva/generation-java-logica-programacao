package LogicaProgramacao;

import java.util.Scanner;

public class Exerc4Lista4 {

	public static void main(String[] args) {
		/*
		 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
			n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
			�mpar exiba o n�mero elevado ao quadrado.*/
		int num;
		double res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
			//raiz quadrada do mesmo
			res = Math.sqrt(num);
		}else {
			//n�mero elevado ao quadrado
			res = Math.pow(num, 2);
		}
		
		System.out.println("Resultado �: "+res);
		
		leia.close();
	}

}
