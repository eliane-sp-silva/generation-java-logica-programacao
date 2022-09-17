package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();//criando objeto tipo arraylist

		do {
			
			System.out.println("\n--------------------------------------------------------");
			System.out.println("Menu de opções do Estoque");
			System.out.println("[1] Deseja adicionar produtos no estoque?");
			System.out.println("[2] Deseja remover produtos do estoque?");
			System.out.println("[3] Deseja atualizar produtos do estoque?");
			System.out.println("[4] Deseja mostrar todos produtos do estoque?");
			System.out.println("[0] Deseja encerrar o programa?");
			System.out.println("Por favor, Digite sua opção: ");
			op = leia.nextInt();
			System.out.println("\n--------------------------------------------------------");
			
			switch (op) {
			case 1:
				leia.nextLine();//leia do tipo string
				System.out.println("Digite o produto que deseja adicionar ao estoque: ");			
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();//leia do tipo string
				System.out.println("Digite o produto que deseja remover ao estoque: ");			
				String produto1 = leia.nextLine();
				if (estoque.contains(produto1)) { //metodo contains verificar se produto está contido no estoque.
					estoque.remove(produto1);					
				}else {
					System.out.println("Produto não existe no estoque!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("Digite o produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("Digite o nome produto que entrará no lugar do: "+verifica+" : ");
				String novo = leia.nextLine();
				
				if (estoque.contains(verifica)) { 
					//metodo contains verificar se produto está contido no estoque.
					estoque.remove(verifica);
					estoque.add(novo);
				}else {
					System.out.println("Produto não existe no estoque!");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("Os produtos do estoque são: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("Muito obrigada em utilizar do nosso sistema, volte sempre...");
				break;
				default:
					System.out.println("Opção inválida!!!");
			}
			
			
		} while (op != 0);
	}

}
