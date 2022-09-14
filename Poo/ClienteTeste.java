package Poo;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Eliane","11999999999","Rua Melchior Giola","33322244455");
		Cliente cliente2 = new Cliente("Dorivaldo Silva","11888888888","Rua Pasqualle Galuppi","44455566677");
		
		System.out.println("*** Histórico de alterações | Clientes***");
		System.out.println("\n");
		cliente1.imprimirInfo();
		cliente1.setNome("Eliane SP Silva");
		System.out.println("Nome alterado para: "+cliente2.getNome());
		cliente1.imprimirInfo();	
		System.out.println("\n");
		cliente2.imprimirInfo();
		cliente2.setTelefone("11777777777");
		System.out.println("Telefone: "+cliente2.getTelefone());
		cliente2.imprimirInfo();
	}

}
