/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
- 10-14 infantil
- 15-17 juvenil
- 18-25 adulto
 */
package ExLacoDecisao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int idade;
		Scanner read = new Scanner(System.in);
		System.out.print("Qual a sua idade para verificar a sua categoria: ");
		idade = read.nextInt();
		if(idade <10)
			System.out.println("Você ainda é criança");
		else if(idade >= 10 && idade <=14)
			System.out.println("Você é infantil");
		else if (idade >=15 && idade <=17)
			System.out.println("Você é juvenil");
		else if(idade >= 18 && idade <= 25)
			System.out.println("Você é adulto");
		else
			System.out.println("Você é Master");
		read.close();
	}
	

}
