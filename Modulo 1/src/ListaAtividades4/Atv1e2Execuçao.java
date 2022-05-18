package ListaAtividades4;

public class Atv1e2Execuçao {
	
	public static void main(String[] args) {
		
		Atv1e2Cachorro cachorro1 = new Atv1e2Cachorro();
		Atv1e2Preguiça preguiça1 = new Atv1e2Preguiça();
		Atv1e2Cavalo cavalo1 = new Atv1e2Cavalo();
		
		System.out.println("CACHORRO\n");
		
		cachorro1.setNome("Pastor Alemão"); 
		cachorro1.setIdade(3);
		cachorro1.status();
		cachorro1.emitirSom();
		cachorro1.locomocao();
	
		System.out.println("\nPREGUIÇA\n");
		
		preguiça1.setNome("Preguiça-comum"); 
		preguiça1.setIdade(4);
		preguiça1.status();
		preguiça1.emitirSom();
		preguiça1.locomocao();
		
		System.out.println("\nCAVALO\n");
		
		cavalo1.setNome("Quanto de milha"); 
		cavalo1.setIdade(2);
		cavalo1.status();
		cavalo1.emitirSom();
		cavalo1.locomocao();
		
	}
	
}
