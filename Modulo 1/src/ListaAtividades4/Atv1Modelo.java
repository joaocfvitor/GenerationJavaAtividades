package ListaAtividades4;

public class Atv1Modelo {
	
	public String nome;
	public int idade;
	public boolean som; 
	
	public void emiteSom() {
		
		this.som = true;

	}
	
	public void naoEmiteSom() {
		
		this.som = false;
	}

	public void escrever() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Emite som ?: " + som);
	}
	
}
