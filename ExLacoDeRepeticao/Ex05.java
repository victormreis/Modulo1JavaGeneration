/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */
package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, soma=0; 
		
		do {
			System.out.print("Digite um n�mero: ");
			num = read.nextInt();
			soma += num;
			
		}while(num != 0);
		System.out.println("A soma de todos os n�meros digitados �: "+soma);
		read.close();

	}

}
