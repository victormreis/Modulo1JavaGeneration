/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */
package VetoreseMatrizes;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int mat [][] = new int [3][3];
		int total =0, diagonal=0, l, c;
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.print("Digite um número: ");
				mat[l][c] = read.nextInt();
				total = total + mat[l][c];
			}
		}
		
		for(l=0;l<3;l++) {
			diagonal = diagonal + mat[l][l];
		}
		System.out.println("A soma total da matriz é "+total +" e a soma da diagonal principal é "+diagonal);
		read.close();

	}

}
