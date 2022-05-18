package ListaAtividades4;

import java.util.*;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class Atv3Collection {


	public static void main(String[] args) {
		
		ArrayList<String> estoque = new ArrayList<>();
	
		estoque.add("Camisa T-shirt");
		estoque.add("Calça Jeans");
		estoque.add("Meia");
		estoque.add("Blusa de frio");
		estoque.add("Camisa Regata");
		
		Collections.sort(estoque); 
		
		System.out.println("ITENS DISPONÍVEIS NO ESTOQUE\n");
		System.out.println(estoque);
			
		System.out.println("\nITEM DISPONÍVEL NO INDICE (2)\n");
		System.out.println(estoque.get(2));
		
		System.out.println("\nREMOVER ITEM DO INDICE (4)\n");
		estoque.remove(4);
		System.out.println(estoque);
		
		System.out.println("\nADICIONAR NOVO ITEM\n");
		System.out.println("Bermuda");
		estoque.add("Bermuda");
		Collections.sort(estoque);
		
		System.out.println("\nESTOQUE ATUALIZADO\n");
		System.out.println(estoque);	
		
	}
}
