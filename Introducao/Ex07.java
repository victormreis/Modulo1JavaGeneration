/*
 * Um sistema de equações lineares do tipo:

, pode ser resolvido segundo mostrado abaixo :

 

Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.

 */
package Introducao;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		float a,b,c,d,e,f,x,y;
		Scanner read = new Scanner(System.in);
		System.out.println("Digite os valores de A, B, C, D, E e F: ");
		a = read.nextFloat();
		b = read.nextFloat();
		c = read.nextFloat();
		d = read.nextFloat();
		e = read.nextFloat();
		f = read.nextFloat();
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		System.out.println("Os valores de X e Y são respectivamente: " + x + " e " + y);
		

	}

}
