/*
 * Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os
n�meros de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
 */
package LacosDeRepeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int num, soma=0, cont =1;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um n�mero positivo: ");
		num = read.nextInt();
		
		do {
			soma += cont;
			cont++;
			
		}while(cont <= num);
		System.out.println("A soma entre todos os n�meros entre 1 e "+num+" � "+soma);
		read.close();
		

	}

}
