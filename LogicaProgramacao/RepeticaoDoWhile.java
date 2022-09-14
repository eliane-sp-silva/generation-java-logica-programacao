package LogicaProgramacao;

import java.util.Scanner;

public class RepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numeros,somaNumero=0,media,contNumero=0,idade=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite com um número: ");
		numeros = leia.nextFloat();
		
		do {
			if (numeros == 0) {
				System.out.println("Sair do loop...");
			}else if (numeros > 0 ) {
				somaNumero +=numeros;
				contNumero++;
				
				System.out.println("Digite um número: ");
				numeros = leia.nextFloat();
			}
			
			
		}while(numeros != 0);
		
		if (contNumero == 0) {
			System.out.println("Não é possível fazer divisão por zero!");
		}else {
			media = somaNumero / contNumero;
			System.out.printf("Média dos números maiores que 0: %.2f",media);
		}
		
		while (idade < 1 || idade > 120) {
			System.out.println("Digite uma nova idade: ");
		}
	}

}
