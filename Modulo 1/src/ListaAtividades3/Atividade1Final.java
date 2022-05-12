package ListaAtividades3;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Atividade1Final {
	
	public static void main(String args[]) {
		
		Atividade1Modelo Cliente1 = new Atividade1Modelo();
		
		Cliente1.nome = "João Vitor";
		Cliente1.idade = 21;
		Cliente1.sexo = "Masculino";
		Cliente1.peso = 67.5;
		Cliente1.altura = 1.87;
		
		Cliente1.escreva();
		
		Cliente1.tamanhoRoupa();
		
	}
}
