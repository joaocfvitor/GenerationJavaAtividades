package ListaAtividades4;

public class Atv1e2Execu�ao {
	
	public static void main(String[] args) {
		
		Atv1e2Cachorro cachorro1 = new Atv1e2Cachorro();
		Atv1e2Pregui�a pregui�a1 = new Atv1e2Pregui�a();
		Atv1e2Cavalo cavalo1 = new Atv1e2Cavalo();
		
		System.out.println("CACHORRO\n");
		
		cachorro1.setNome("Pastor Alem�o"); 
		cachorro1.setIdade(3);
		cachorro1.status();
		cachorro1.emitirSom();
		cachorro1.locomocao();
	
		System.out.println("\nPREGUI�A\n");
		
		pregui�a1.setNome("Pregui�a-comum"); 
		pregui�a1.setIdade(4);
		pregui�a1.status();
		pregui�a1.emitirSom();
		pregui�a1.locomocao();
		
		System.out.println("\nCAVALO\n");
		
		cavalo1.setNome("Quanto de milha"); 
		cavalo1.setIdade(2);
		cavalo1.status();
		cavalo1.emitirSom();
		cavalo1.locomocao();
		
	}
	
}
