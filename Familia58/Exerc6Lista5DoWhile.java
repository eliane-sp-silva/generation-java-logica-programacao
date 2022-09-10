package Familia58;

import java.util.Scanner;

public class Exerc6Lista5DoWhile {

	public static void main(String[] args) {
		/*6- Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		int num,contMult3=0,somaMult3=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		do {
			if (num == 0) {
				System.out.println("Sair do loop!");
			}else {
				if (num % 3 == 0) {
					somaMult3 += num;
					contMult3++;
				} 
				System.out.println("Digite outro número: ");
				num = leia.nextInt();
			}
		} while (num != 0);
		if(contMult3 == 0) {
			System.out.println("Não podemos dividir por zero");
		}else {
			media = somaMult3 / contMult3;
			System.out.println("Média"+media);
		}
		leia.close();
	}

}
