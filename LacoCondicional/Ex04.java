/*
 * Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este
n�mero � par ou �mpar, e se � positivo ou negativo.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int num;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		num = read.nextInt();
		if(num % 2 == 0 && num > 0) {
			System.out.println("O n�mero "+num+" � Par e positivo!");
		}else if(num % 2 == 0 && num < 0 ) {
			System.out.println("O n�mero "+num+" � Par e Negativo!");
		}else if(num % 2 != 0 && num > 0 ) {
			System.out.println("O n�mero "+num+" � Impar e Positivo!");
		}else if(num % 2 != 0 && num < 0 ) {
			System.out.println("O n�mero "+num+" � Impar e Negativo!");
		}else {
			System.out.println("O n�mero "+num+" � Neutro!");
		}
		read.close();
		

	}

}
