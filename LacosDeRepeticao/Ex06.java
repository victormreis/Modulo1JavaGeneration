/*
 * Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
 */
package LacosDeRepeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int num, soma=0, cont =1;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um número positivo: ");
		num = read.nextInt();
		
		do {
			soma += cont;
			cont++;
			
		}while(cont <= num);
		System.out.println("A soma entre todos os números entre 1 e "+num+" é "+soma);
		read.close();
		

	}

}
