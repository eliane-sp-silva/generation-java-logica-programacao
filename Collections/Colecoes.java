package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		
		//tipo de dados na lista, objeto do tipo list que instancia um arraylist.
		//List � uma interface e n�o pode ser instanciada. ArrayList faz heran�a ao List
		List<Integer> minhaLista = new ArrayList<Integer>(); //criando um objeto do tipo list
		
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(7);

		//for-each para visualizar
		for (Integer listaElementos : minhaLista) { //variavel de loop
			System.out.println(listaElementos);
		}
		
		//remover
		System.out.println(" Removendo um elemento da lista...");
		System.out.println();//limpa tela de execu��o e impress�o. m�moria cache. muito utilizado para manipula��o de dados
		//n�o � o mesmo que "limpatela" do portugol que limpa o console.
		minhaLista.remove(0); //remove item da lista a partir do seu indice.
		
		//visualiza lista atualizada
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}
		int primeiroElemento = minhaLista.get(0);//qual posi��o pegar o elemento.
		System.out.println("O primeiro elemento foi: "+primeiroElemento);
		System.out.println();
		
		for (int i = 0; i < minhaLista.size(); i++) {
			System.out.println("Elemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);//m�todo sort -> ordena lista
		System.out.println("Depois de ordenada...");
		System.out.println(minhaLista);
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();//HashSet � subclasse que pode ser instanciada no lugar da interface Set
		//Set n�o permite dados duplicados
		meuSet.add(5);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(2);
		meuSet.add(5);
		
		Iterator<Integer>iMeuSet = meuSet.iterator(); //api - para percorrer, remover, gerenciar, atualizar dentro de cada collection
		
		while(iMeuSet.hasNext()) //percorrer meu iMeuSet e verificar cada elemento at� chegar no fim da cole��o.
		{
			System.out.println(iMeuSet.next()); //imprimir sempre o proximo elemento, n�o sendo necess�rio indicar pr�ximo indice.
			//se tiver valor duplicado o set n�o imprime duplicado nesse caso 5 foi impresse somente uma vez.
		}
		
	}
	

}
