package ListaAtividades2;

import java.util.Scanner;

/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

public class Atividade5 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x, soma = 0;
		
		do {		
			
			x = (int) Math.floor(Math.random() * 9);
			
			System.out.println(x);
			
			soma = soma + x;
		}
		
		while (x!=0);
		
		System.out.println("\nA soma dos n�meros � de: " + soma);
		
	} 
}
