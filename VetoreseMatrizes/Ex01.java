/*
 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
 */
package VetoreseMatrizes;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {		
			int vet[] = new int [5], maior =0, i;	
			Scanner read = new Scanner(System.in);			
			for(i=0;i<5;i++) {
				System.out.print("Digite o "+(i+1)+"� valor: ");
				vet[i]= read.nextInt();
				read.close();
				if(vet[i]>maior) {
					maior = vet[i];
				}
			}			
			System.out.println("Os n�meros digitados foram: ");
			for(i=0; i<5;i++) {
				System.out.print(vet[i]+"\t");
			}
			
			System.out.println("\nE o maior n�mero digitado foi: "+maior);
			
		
	}

}
