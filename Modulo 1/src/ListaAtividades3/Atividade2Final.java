package ListaAtividades3;

public class Atividade2Final {
	
	public static void main(String args[]) {
		
		Atividade2Modelo aviao = new Atividade2Modelo(null, 0, 0);
		
		aviao.decolando = true;
		aviao.marcaAviao = "Gool";
		aviao.quantPasageiros = 250;
		aviao.horariovoo = 10.25;
		aviao.escrever();
		
	}

}
