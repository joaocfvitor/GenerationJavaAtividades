package ListaAtividades1;

import java.util.*;

/*2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Entre com o primeiro n�mero: ");
		n1 = ler.nextInt();
		
		System.out.print("Entre com o primeiro n�mero: ");
		n2 = ler.nextInt();
				
		System.out.print("Entre com o primeiro n�mero: ");
		n3 = ler.nextInt();
		
		if(n1>n2 && n1>n3 && n2>n3) {
			System.out.print("\nOrdem: "+n3+" "+n2+" "+n1);
		}
		
		else if (n1>n2 && n1>n3 && n3>n2) {
			System.out.print("\nOrdem: "+n2+" "+n3+" "+n1);
		}
		
		else if (n2>n1 && n2>n3 && n1<n3) {
			System.out.print("\nOrdem: "+n1+" "+n3+" "+n2);
		}
		
		else if (n2>n1 && n2>n3 && n1>n3) {
			System.out.print("\nOrdem: "+n3+" "+n1+" "+n2);
		}
		
		else if (n3>n1 && n3>n2 && n1>n2) {
			System.out.print("\nOrdem: "+n2+" "+n1+" "+n3);
		}
		
		else if (n3>n1 && n3>n2 && n1<n2) {
			System.out.print("\nOrdem: "+n1+" "+n2+" "+n3);
		}
	}
}
