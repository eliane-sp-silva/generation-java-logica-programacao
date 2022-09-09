package Familia58;

import java.util.Scanner;

public class Exerc3Lista4 {

	public static void main(String[] args) {
		/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
			categoria ela se encontra:
			 10-14 infantil
			 15-17 juvenil
			 18-25 adulto
		  */
		int idade;
		
		Scanner leia = new Scanner(System.in);
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <=14) {
			System.out.println("Categoria Infantil");
		} else if (idade >= 15 && idade <=17) {
			System.out.println("Categoria juvenil");
		} else{
			System.out.println("Categoria adulto");
		}
		
		leia.close();
	}

}
