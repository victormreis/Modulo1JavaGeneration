/*
 * Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int num;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		num = read.nextInt();
		if(num % 2 == 0 && num > 0) {
			System.out.println("O número "+num+" é Par e positivo!");
		}else if(num % 2 == 0 && num < 0 ) {
			System.out.println("O número "+num+" é Par e Negativo!");
		}else if(num % 2 != 0 && num > 0 ) {
			System.out.println("O número "+num+" é Impar e Positivo!");
		}else if(num % 2 != 0 && num < 0 ) {
			System.out.println("O número "+num+" é Impar e Negativo!");
		}else {
			System.out.println("O número "+num+" é Neutro!");
		}
		read.close();
		

	}

}
