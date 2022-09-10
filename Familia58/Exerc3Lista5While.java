package Familia58;

import java.util.Scanner;

public class Exerc3Lista5While {

	public static void main(String[] args) {
		/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)*/ 

		int idade=0,contMenor21=0,contMais50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Para SAIR => Digite -99");
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			if (idade < 21) {
				contMenor21++;
			}else if (idade > 50) {
				contMais50++;
			}
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+contMenor21);
		System.out.println("Total de pessoas com menos de 50 anos: "+contMais50);
		
		leia.close();
	}

}
