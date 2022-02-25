/*
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
package Introducao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int horas, minutos, segundos, total;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Quantos Segundos durou o evento? ");
		total = read.nextInt();
		horas = total / 3600;
		minutos = (total - (horas * 3600)) / 60 ;
		segundos = total % 60;
		System.out.println("O evento durou " + horas + ":" + minutos + ":" + segundos + " Horas/minutos/Segundos");
		
		
	

	}

}
