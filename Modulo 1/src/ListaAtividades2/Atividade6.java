package ListaAtividades2;

import java.util.Scanner;

/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

public class Atividade6 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x, soma = 0, y = -1; 
		
		System.out.println("SISTEMA INICIADO, CASO DESEJE ENCERRAR DIGITE 0");
		
		do {
			
			System.out.print("Entre com um n�mero: ");
			x = ler.nextInt();	
		
			if(x%3==0) {
				
				soma = soma + x;
				y++;
				
			}	
		}
		
		while (x!=0);
		
		System.out.println("\nA m�dia dos n�meros multiplos de 3 �: " + (soma/y));
		
	}
}