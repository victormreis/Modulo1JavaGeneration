/*
 * Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:
 */
package Introducao;


import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		double a, b, c, r, s, d;
		s =0;
		
		Scanner read = new Scanner(System.in);
		
		
		System.out.print("Digite 3 Numeros inteiros e positivos: ");
		a = read.nextDouble();
		b = read.nextDouble();
		c = read.nextDouble();
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);			
		d = (r + s) / 2;
		System.out.println("O resultado da expressão é: " + d);				
		
		read.close();
	}

}
