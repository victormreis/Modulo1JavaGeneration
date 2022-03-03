/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 */
package VetoreseMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {	
		Scanner read = new Scanner(System.in);
		Random u = new Random();
		int n1 [][] = new int [4][6];
		int n2 [][] = new int [4][6];
		int m1 [][] = new int [4][6];
		int m2 [][] = new int [4][6];
		int l, c;
		
		for (l = 0;l<4;l++) {
			for(c=0;c <6;c++) {
				
				n1[l][c] = u.nextInt(20);
			}
		}
		for (l = 0;l<4;l++) {
			for(c=0;c <6;c++) {
				//System.out.print("Digite um número: ");
				n2[l][c] = u.nextInt(20);
			}
		}
		for (l = 0;l<4;l++) {
			for(c=0;c <6;c++) {				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2 [l][c];
			}
		}
		read.close();
			
	}

}
