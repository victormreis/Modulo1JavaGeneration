/*
 * Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
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
			System.out.println("Voc� ainda � crian�a");
		else if(idade >= 10 && idade <=14)
			System.out.println("Voc� � infantil");
		else if (idade >=15 && idade <=17)
			System.out.println("Voc� � juvenil");
		else if(idade >= 18 && idade <= 25)
			System.out.println("Voc� � adulto");
		else
			System.out.println("Voc� � Master");
		read.close();
	}
	

}
