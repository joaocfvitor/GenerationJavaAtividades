package ListaAtividades3;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Atividade1Modelo {
	
// CARACTERISTICAS -> ATRIBUTOS
	
	String nome;
	int idade;
	String sexo; 
	double peso; 
	double altura; 
	
// COMPORTAMENTO -> METODOS	
	
	void escreva() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		
	}
	void defineTamnha() {
		
	}
	void tamanhoRoupa() {
		
		double per = this.peso / this.altura;
		
		if(per>28 && per<=34) {
			System.out.println("Recomendamos as roupas de tamanho P");
		}
		
		else if(per>34 && per<=44) {
			System.out.println("Recomendamos as roupas de tamanho M");
		}
		
		else if(per>44 && per<=56) {
			System.out.println("Recomendamos as roupas de tamanho G");
		}
		
		else {
			System.out.println("Não temos roupas disponíveis para suas médidas");
		}
	}

}
