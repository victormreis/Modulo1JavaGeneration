/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.

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
		System.out.println("\nA média dos numeros lançados foi: "+media);
		System.out.println("O maior numero lançado foi "+maior+" e ele apareceu "+cont+" vezes");
		
		
	

	}

}
