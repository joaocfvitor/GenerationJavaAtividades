package ListaAtividades2;

import java.util.Scanner;

/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
A o número de pessoas calmas;
B o número de mulheres nervosas;
C o número de homens agressivos;
D o número de outros calmos;
E o número de pessoas nervosas com mais de 40 anos;
F o número de pessoas calmas com menos de 18 anos.*/

public class Atividade4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int cad = 1, idade, sex, per;
		int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0;

		
		while(cad <= 3) {
			
			System.out.print("\nCadastro nº: " + cad);
			
			System.out.print("\nDigite sua idade: ");
			idade = ler.nextInt();
			
				if(idade<=0 || idade>=105) {
					
					System.out.println("A idade inserida é inválida");
					
					System.out.print("\nDigite sua idade novamente: ");
					idade = ler.nextInt();
					
				}
			
			System.out.print("Digite seu sexo, 1 - Feminino, 2 - Masculino ou 3 - Outros: ");
			sex = ler.nextInt();
			
				if(sex<1 || sex>3) {
					
					System.out.println("O número inserido é inválido");
					
					System.out.print("Digite seu sexo novamente, 1 - Feminino, 2 - Masculino ou 3 - Outros: ");
					sex = ler.nextInt();
					
				}
			
			System.out.print("Digite sua personalidade, 1 - Calmo(a), 2 - Nervoso(a) ou 3 - Agressivo(a): ");
			per = ler.nextInt();
			
				if(per<1 || per>3) {
					
					System.out.println("O número inserido é inválido");
					
					System.out.print("Digite sua personalidade novamente, 1 - Calmo(a), 2 - Nervoso(a) ou 3 - Agressivo(a): ");
					per = ler.nextInt();
					
				}
			
			if (per==1) {	
				A++;
			}
			
			if (sex==1 && per==2) {
				B++;
			}
			
			if (sex==2 && per==3) {
				C++;
			}
			
			if (sex==3 && per==1) {
				D++;
			}
			
			if (per==2 && idade>40) {
				E++;
			}
			
			if(per==1 && idade<18) {
				F++;
			}
			
			cad++;
			
		}
		
		System.out.print("\nO número de pessoas calmas: " + A);
		System.out.print("\nO número de mulheres nervosas: " + B);
		System.out.print("\nO número de homens agressivos: " + C);
		System.out.print("\nO número de outros calmos: " + D);
		System.out.print("\nO número de pessoas nervosas com mais de 40 anos: " + E);
		System.out.print("\nO número de pessoas calmas com menos de 18 anos: " + F);
	}
}