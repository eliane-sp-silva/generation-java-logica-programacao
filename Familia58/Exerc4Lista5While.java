package Familia58;

import java.util.Scanner;

public class Exerc4Lista5While {

	public static void main(String[] args) {
		/*4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		-> o n�mero de pessoas calmas;
		-> o n�mero de mulheres nervosas;
		-> o n�mero de homens agressivos;
		-> o n�mero de outros calmos;
		-> o n�mero de pessoas nervosas com mais de 40 anos;
		-> o n�mero de pessoas calmas com menos de 18 anos.*/
		
		
		int idade,contCalma=0,contNervoses=0, contAgressives=0,contNaoDeclarado=0;
		int pessoas=0,genero=0,fatorPsico,calmaMenor18=0,contPessoaNervosa40=0;
		
		Scanner leia = new Scanner(System.in);
		
	
		//alterar qtde de pessoas
		while (pessoas < 150) {
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			while (idade<1 || idade>120) {
				System.out.println("Digite numero de idade v�lido: ");
				idade = leia.nextInt();
			}
			System.out.println("Digite seu genero \n[1]Feminino \n[2]Masculino \n[3]N�o declarado");
			genero = leia.nextInt();
			
			while(genero<1 || genero>3) {
				System.out.println("Digite seu genero novamente:\n[1]Feminino\n[2]Masculino\n[3]N�o declarado ");
				genero = leia.nextInt();
			}
			System.out.println("Digite seu fator psicol�gico: \n[1]Calma \n[2]Nervosa \n[3]Agressiva");
			fatorPsico = leia.nextInt();
			
			while(fatorPsico<1 || fatorPsico>3) {
				System.out.println("\nDigite seu fator psicol�gico novamente:\n[1]Calma\n[2]Nervosa\n[3]Agressiva ");
				fatorPsico = leia.nextInt();
			}
			
			if(fatorPsico == 1) {
				contCalma++;
			}
			
			if(genero == 1 && fatorPsico == 2) {
				contNervoses++;
			}
			
			if(genero == 2 && fatorPsico == 3) {
				contAgressives++;
			}
			
			if(genero == 3 && fatorPsico == 1) {
				contNaoDeclarado++;
			}
			
			if(fatorPsico == 2 && idade > 40) {
				contPessoaNervosa40++;
			}
			
			if(fatorPsico == 1 && idade < 18) {
				calmaMenor18++;
			}
			
			//para sair do la�o depois do tamanho da length
			pessoas++;
		}
		
		System.out.println("N�mero de pessoas calmas: "+contCalma);
		System.out.println("N�mero de mulheres nervosas: "+contNervoses);
		System.out.println("N�mero de homens agressivos: "+contAgressives);
		System.out.println("N�mero de pessoas n�o declaradas calmas: "+contNaoDeclarado);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: "+contPessoaNervosa40);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: "+calmaMenor18);
	
		leia.close();
	}

}
