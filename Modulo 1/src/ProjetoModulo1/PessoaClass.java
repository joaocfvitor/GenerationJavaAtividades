package ProjetoModulo1;

import java.util.Scanner;

public class PessoaClass extends SuperClass implements InterfaceCadastrar {
	
		Scanner ler = new Scanner(System.in);
		
		private boolean paiMaeDePet;
		private int camasQuentinhas;
		private String contato;
		private String email;
		private int quantPets;

		public boolean isPaiMaeDePet() {
			return paiMaeDePet;
		}
		public void setPaiMaeDePet(boolean paiMaeDePet) {
			this.paiMaeDePet = paiMaeDePet;
		}

		public int getCamasQuentinhas() {
			return camasQuentinhas;
		}
		public void setCamasQuentinhas(int camasQuentinhas) {
			this.camasQuentinhas = camasQuentinhas;
		}

		public int getQuantPets() {
			return quantPets;
		}
		public void setQuantPets(int quantPets) {
			this.quantPets = quantPets;
		}
		
		public String getContato() {
			return contato;
		}
		public void setContato(String contato) {
			this.contato = contato;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}


		// METODO DE CADASTRO - UTILIZANDO O SOBREPOSI��O 
		
		@Override
		public void cadastro() {
		
		System.out.print("Nome: ");
		setNome(ler.next());
		
		System.out.print("Indade: ");
		setIdade(ler.nextInt());
		
		System.out.print("Endere�o: ");
		setEndere�o(ler.next());
		
		System.out.print("Telefone: ");
		setContato(ler.next());
		
		System.out.print("Email: ");
		setEmail(ler.next());
		
		System.out.print("Voce j� � pai ou m�e um fofopet (true or false) ?:");
		setPaiMaeDePet(ler.nextBoolean());
		
		if(paiMaeDePet == true) {
			
			System.out.print("Quantos FofoPets voc� tem ?: ");
			setQuantPets(ler.nextInt());
	
		}
		
		if(quantPets > 0) {
			
			System.out.print("\nMuito bem! Vamos indicar o FofoPet que ama fazer amigos!\n");
			
		}
		
		System.out.print("Quantas camas quentinhas voc� tem dispon�vel: ");
		setCamasQuentinhas(ler.nextInt());
		
		System.out.print("\nObrigado Fofoter e ajudar os Fofopets com um lar temporario, entraremos em contato em breve!!\n");
		
		System.out.println("\n************************************************************************************************\n");
		
		}
}
