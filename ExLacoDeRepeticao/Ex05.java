/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */
package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, soma=0; 
		
		do {
			System.out.print("Digite um número: ");
			num = read.nextInt();
			soma += num;
			
		}while(num != 0);
		System.out.println("A soma de todos os números digitados é: "+soma);
		read.close();

	}

}
