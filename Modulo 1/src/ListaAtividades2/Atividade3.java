package ListaAtividades2;

import java.util.Scanner;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);		
		int idade, x = 0, y = 0;
		
		System.out.println("ESTE É UM SISTEMA DE CONTAGEM DE IDADE, QUANDO QUISER ENCERRAR DIGITE -99\n");
		
		System.out.print("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		
		if (idade>=21 && idade <=50) {
			
			System.out.println("\nSua idade não computa no somatório\n");
			
		}
		
		while (idade != -99) {
			
			System.out.print("Entre com a sua idade: ");
			idade = ler.nextInt();
			
			if (idade<21) {
				
				x++;
				
			}
			
			else if (idade>50) {
				
				y++;
				
			}
			
			else if (idade>=21 && idade <=50) {
				
				System.out.println("\nSua idade não computa no somatório\n");
				
			}
			
		}
		
		System.out.println("\nPessoas com menos de 21 anos = " + x);
		System.out.println("Pessoas com mais de 50 anos = " + y);
		
	}
}
