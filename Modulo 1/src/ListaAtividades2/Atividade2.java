package ListaAtividades2;

import java.util.Scanner;

//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x, p = 0, i = 0; 
		
		for(int y=0; y<=10; y++) {
			
			x = (int) Math.floor(Math.random() * 100);
			
			System.out.println(x);
			
			if (x%2==0) {
				
				p++;
				
			}
			
			else {
				
				i++;
				
			}
			
		}
		
		System.out.println("\nA soma de n�meros pares � de: " + p);
		System.out.println("\nA soma de n�meros impares � de: " + i);
		
	}
}
