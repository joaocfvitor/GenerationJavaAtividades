package ListaAtividades1;

import java.util.Scanner;
import java.math.*;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

public class Atividade4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.print("Entre com um n�mero: ");
		x = ler.nextInt();
		
		int p = (x%2);
		
		if(p==0) {
			System.out.println("\nO n�mero inserido � Par, sua raiz quadrada � " + Math.sqrt(x));
		}
		
		else {
			System.out.println("\nO n�mero inserido � Impar, sua pot�ncia � " + Math.pow(x, 2));
		}
	}

}
