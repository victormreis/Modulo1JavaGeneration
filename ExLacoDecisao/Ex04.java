/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */
package ExLacoDecisao;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		double num;
		Scanner read = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		num = read.nextDouble();
		if(num%2 == 0 && num != 0) {
			System.out.println("O n�mero digitado � Par");
			System.out.println("A raiz quadrada do n�mero "+num+" � "+(num=Math.sqrt(num)));
			
		}
		else if(num%2 !=0) {
			System.out.println("O n�mero digitado � Impar");
			System.out.println("O n�mero "+num+" elevado ao quadrado � "+(num=Math.pow(num, 2)));
		}
		else
			System.out.println("Voc� digitou o n�mero 0 e ele � neutro!");
		read.close();
	}

}
