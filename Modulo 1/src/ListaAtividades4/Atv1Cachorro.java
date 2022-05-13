package ListaAtividades4;

public class Atv1Cachorro extends Atv1Modelo {

	public static void main(String[] args) {
		
		String locomocao = "Correr"; 
		
		Atv1Modelo especie1 = new Atv1Modelo();
		Atv1Modelo especie2 = new Atv1Modelo();
		
		especie1.nome = "Pastor Alemão";
		especie1.idade = 3;
		especie1.emiteSom();
		especie1.escrever();
		System.out.println("Locomoção: " + locomocao + "\n");
		
		especie2.nome = "Labrador";
		especie2.idade = 7;
		especie2.emiteSom();
		especie2.escrever();
		System.out.println("Locomoção: " + locomocao + "\n");
		
	}
}