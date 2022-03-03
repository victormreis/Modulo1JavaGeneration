/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
package ExLacoDecisao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n1 = read.nextInt();
		System.out.print("Digite um número: ");
		n2 = read.nextInt();
		System.out.print("Digite um número: ");
		n3 = read.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O número "+n1+" foi o maior número digitado.");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("O número "+n2+" foi o maior número digitado.");
		}else
			System.out.println("o número "+n3+" foi o maior número digitado.");
		read.close();
		

	}

}
