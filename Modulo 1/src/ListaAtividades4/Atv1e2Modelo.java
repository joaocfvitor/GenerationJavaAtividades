package ListaAtividades4;

public class Atv1e2Modelo {
	
	private String nome;
	private int idade;
	

// METODOS DE EMITIR SOM E DE LOCOÇÃO DO ANIMAL (CARACTERISTICAS EM COMUM)
	
	public void emitirSom() {
		
		System.out.println("Som do animal!");
		
	}
	
	public void locomocao() {
		
		System.out.println("Locomoção do animal!");
		
	}
	
// METODO STATUS
	
	public void status() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		
	}
	
// GET E SET - METODOS ACESSORES 	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
