package ListaAtividades4;

public class Atv1Cavalo extends Atv1Modelo {

	public static void main(String[] args) {
		
		String locomocao = "Correr"; 
		
		Atv1Modelo especie1 = new Atv1Modelo();
		Atv1Modelo especie2 = new Atv1Modelo();
		
		especie1.nome = "Quarto de Milha";
		especie1.idade = 2;
		especie1.emiteSom();
		especie1.escrever();
		System.out.println("Locomoção: " + locomocao + "\n");
		
		especie2.nome = "Manga Larga";
		especie2.idade = 4;
		especie2.emiteSom();
		especie2.escrever();
		System.out.println("Locomoção: " + locomocao + "\n");
		
	}
}