package ListaAtividades4;

public class Atv1Preguiça extends Atv1Modelo {

	public static void main(String[] args) {
		
		String locomocao = "Subir em árvore"; 
		
		Atv1Modelo especie1 = new Atv1Modelo();
		Atv1Modelo especie2 = new Atv1Modelo();
		
		especie1.nome = "preguiça-comum";
		especie1.idade = 5;
		especie1.emiteSom();
		especie1.escrever();
		System.out.println("Locomoção: " + locomocao + "\n");
		
		especie2.nome = "preguiça-de-coleira";
		especie2.idade = 3;
		especie2.emiteSom();
		especie2.escrever();
		System.out.println("Locomoção: " + locomocao + "\n");
		
	}
}
