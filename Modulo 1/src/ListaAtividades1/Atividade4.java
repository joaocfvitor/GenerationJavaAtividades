package ListaAtividades1;

import java.util.Scanner;
import java.math.*;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

public class Atividade4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.print("Entre com um número: ");
		x = ler.nextInt();
		
		int p = (x%2);
		
		if(p==0) {
			System.out.println("\nO número inserido é Par, sua raiz quadrada é " + Math.sqrt(x));
		}
		
		else {
			System.out.println("\nO número inserido é Impar, sua potência é " + Math.pow(x, 2));
		}
	}

}
