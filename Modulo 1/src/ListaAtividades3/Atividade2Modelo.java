package ListaAtividades3;

/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Atividade2Modelo {
	
// ATRIBUTOS
	
	public String marcaAviao;
	public int quantPasageiros;
	public double horariovoo;
	public boolean decolando;
	
	public Atividade2Modelo (String marca, int passageiros, double horario) {
		this.marcaAviao = marca;
		this.quantPasageiros = passageiros;
		this.horariovoo = horario;
	}
	
	public void escrever() {
		
		System.out.println("Marca: " + this.marcaAviao);
		System.out.println("Passageiros: " + this.quantPasageiros);
		System.out.println("Horario do voo: " + this.horariovoo);
		
		if(decolando==true)
		{
			System.out.println("O avião está em decolagem!");
		}
		else {
			System.out.println("O avião ainda não decolou!");
		}
	}
	
}
