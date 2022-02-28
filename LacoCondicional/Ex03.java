/*
 * Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int n1, n2, n3, n4, q1, q2, q3, q4;
		Scanner read = new Scanner(System.in);
		System.out.println("Digite 04 Numeros!");
		System.out.print("Número 1: ");
		n1= read.nextInt();
		System.out.print("Número 2: ");
		n2= read.nextInt();
		System.out.print("Número 3: ");
		n3= read.nextInt();
		System.out.print("Número 4: ");
		n4= read.nextInt();
		q1 = n1 * n1;
		q2 = n2 * n2;
		q3 = n3 * n3;
		q4 = n4 * n4;
		if(q3 >= 1000) {
			System.out.println("O valor do Quadrado de "+n3+" é: "+q3);
		}else {
			System.out.println("O valor do Quadrado de "+n1+" é: "+q1);
			System.out.println("O valor do Quadrado de "+n2+" é: "+q2);
			System.out.println("O valor do Quadrado de "+n3+" é: "+q3);
			System.out.println("O valor do Quadrado de "+n4+" é: "+q4);
			read.close();
			
		}
	}

}
