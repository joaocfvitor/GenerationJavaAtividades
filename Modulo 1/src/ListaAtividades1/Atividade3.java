package ListaAtividades1;

import java.util.Scanner;

/*3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.print("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("\nCategoria Infantil");
		}
		
		else if(idade>=15 && idade<=17) {
			System.out.println("\nCategoria Juvenil");
		}
		
		else if(idade>=18 && idade<=25) {
			System.out.println("\nCategoria Adulto");
		}
		
		else if(idade<10 || idade>25) {
			System.out.println("\nIdade n�o se enquadra nas categorias disponiveis");
		}
	}
}
