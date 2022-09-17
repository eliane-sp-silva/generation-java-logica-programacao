package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioCollections {
	/*Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa dever� atender as seguintes funcionalidades:
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner leia = new Scanner(System.in);
		List<String> minhaLoja = new ArrayList<String>();
		
		minhaLoja.add("Sapato");
		minhaLoja.add("Camisa");
		minhaLoja.add("Vestido");
		minhaLoja.add("Cal�a");
		minhaLoja.add("Sand�lia");
		minhaLoja.add("Terno");
		
		//visualiza itens
		for (String listaItem : minhaLoja) {
			System.out.println(listaItem);
		}
		
		//remover
		System.out.println("Removendo elemento da lista!");
		//limpar cache (m�moria e execu��o)
		System.out.println();
		minhaLoja.remove(0);
		
		//visualiza lista atualizada
		for (String listaItem : minhaLoja) {
			System.out.println(listaItem);
		}
		
		//chamar uma posi��o
		String primeiroItem = minhaLoja.get(0);
		System.out.println("O primeiro item foi: "+primeiroItem);
		System.out.println();
		
		for (String listaItem : minhaLoja) {
			System.out.println();
		}
		
		leia.close();
	}

}
