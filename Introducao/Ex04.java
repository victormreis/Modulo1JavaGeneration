/*
 * Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:
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
		System.out.println("O resultado da express�o �: " + d);				
		
		read.close();
	}

}
