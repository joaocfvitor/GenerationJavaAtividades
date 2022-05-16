package IntroduçãoPOO;

import java.util.*;

public class Atv2Collections {
	
	public static void main(String[] args) {
		
		String aula1 = "BlocoI";
		String aula2 = "BlocoII";
		String aula3 = "BlocoIII";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula3);
		aulas.add(aula2);
		
		System.out.println("Conteudo do indice (2)");
		System.out.println(aulas.get(2));
		
		System.out.println("Conteudo do ArrayList aulas");
		System.out.println(aulas);
		
		System.out.println("Lista organizada");
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
