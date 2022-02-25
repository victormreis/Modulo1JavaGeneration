/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package Introducao;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int anos, meses, dias, total; 
		Scanner read = new Scanner(System.in); 
		
		System.out.print("Quantos Anos completos você tem? ");
		anos = read.nextInt();
		System.out.print("Quantos meses completos você tem? ");
		meses=read.nextInt();
		System.out.print("Quantos dias completos você tem? ");
		dias=read.nextInt();
		total = (anos * 365 ) + (meses * 30) + dias ;
		System.out.print("Você já viveu " + total + " dias!");
		
				
	}

}
