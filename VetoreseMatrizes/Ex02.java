/*
 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.

 */
package VetoreseMatrizes;

import java.util.Random;


public class Ex02 {

	public static void main(String[] args) {
		Random u = new Random();		
		int dado[]=new int[10],  total =0, maior = 0, i , media, cont =0;
		
		
		for(i=0;i<10;i++) {
			dado[i] = u.nextInt(6)+1;
			total = total + dado[i];
			if(dado[i]>maior) {
				maior = dado[i];
			}
			
		}
		media = total / 10;
		for(i=0;i<10;i++) {
			System.out.print(dado[i]+"\t");
			if(dado[i]==maior) {
				cont++;
			}
		}
		System.out.println("\nA m�dia dos numeros lan�ados foi: "+media);
		System.out.println("O maior numero lan�ado foi "+maior+" e ele apareceu "+cont+" vezes");
		
		
	

	}

}
