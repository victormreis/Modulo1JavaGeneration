/*
 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
 */

package Introducao;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		float n1, n2, n3, media;		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite a nota da prova 1: ");
		n1 = read.nextFloat();
		System.out.print("Digite a nota da prova 2: ");
		n2 = read.nextFloat();
		System.out.print("Digite a nota da prova 2: ");
		n3 = read.nextFloat();
		media =((n1 *2) + (n2 * 3) + (n3 *5 )) / 10 ;
		System.out.print("A m�dia final do aluno �: " + media);
		
		read.close();
		
	}

}
