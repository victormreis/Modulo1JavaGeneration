/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
package ExLacoDecisao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		n1 = read.nextInt();
		System.out.print("Digite um n�mero: ");
		n2 = read.nextInt();
		System.out.print("Digite um n�mero: ");
		n3 = read.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O n�mero "+n1+" foi o maior n�mero digitado.");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("O n�mero "+n2+" foi o maior n�mero digitado.");
		}else
			System.out.println("o n�mero "+n3+" foi o maior n�mero digitado.");
		read.close();
		

	}

}
