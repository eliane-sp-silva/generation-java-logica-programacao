package Familia58;

import java.util.Scanner;

public class Exerc6Lista5DoWhile {

	public static void main(String[] args) {
		/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		int num,contMult3=0,somaMult3=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextInt();
		
		do {
			if (num == 0) {
				System.out.println("Sair do loop!");
			}else {
				if (num % 3 == 0) {
					somaMult3 += num;
					contMult3++;
				} 
				System.out.println("Digite outro n�mero: ");
				num = leia.nextInt();
			}
		} while (num != 0);
		if(contMult3 == 0) {
			System.out.println("N�o podemos dividir por zero");
		}else {
			media = somaMult3 / contMult3;
			System.out.println("M�dia"+media);
		}
		leia.close();
	}

}
