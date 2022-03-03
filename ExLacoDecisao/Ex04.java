/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */
package ExLacoDecisao;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		double num;
		Scanner read = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		num = read.nextDouble();
		if(num%2 == 0 && num != 0) {
			System.out.println("O número digitado é Par");
			System.out.println("A raiz quadrada do número "+num+" é "+(num=Math.sqrt(num)));
			
		}
		else if(num%2 !=0) {
			System.out.println("O número digitado é Impar");
			System.out.println("O número "+num+" elevado ao quadrado é "+(num=Math.pow(num, 2)));
		}
		else
			System.out.println("Você digitou o número 0 e ele é neutro!");
		read.close();
	}

}
