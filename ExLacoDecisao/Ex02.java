/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */
package ExLacoDecisao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int n1,n2,n3, c1=0,c2=0,c3=0;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n1 = read.nextInt();
		System.out.print("Digite um número: ");
		n2 = read.nextInt();
		System.out.print("Digite um número: ");
		n3 = read.nextInt();
		
		if(n1>n2 && n1>n3) {
			c3 = n1;
			if(n2 < n3) {
				c2 = n3;
				c1 = n2;
			}else {
				c2=n2;
				c1 = n3;
			}
		}
		else if(n2>n1 && n2>n3) {
				c3 = n2;
				if(n1 < n3) {
					c2 = n3;
					c1 = n1;
				}else {
					c2=n1;
					c1 = n3;
				}				
		}
		else if(n3>n1 && n3>n2) {
			c3 = n3;
			if(n1 < n2) {
				c2 = n2;
				c1 = n1;
			}else {
				c2=n1;
				c1 = n2;
			}
		}		
	
		System.out.println("A ordem crescente dos números é: ");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		read.close();

	}

}
