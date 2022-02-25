/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
package Introducao;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		int anos, meses, dias,  total;		
		Scanner read = new Scanner(System.in);		
		System.out.print("Digite quantos dias você já viveu: ");
		total = read.nextInt();
		anos = total / 365; 
		meses = total % 365;
		dias = meses % 30;
		meses = meses  / 30;
		System.out.println("Você tem " + anos + " anos, " + meses + " e meses " + dias + " dias de vida!");
				
		
		
	}

}
