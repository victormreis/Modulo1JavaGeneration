/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num, par=0,impar=0;
		for(int i=1;i<=10;i++) {
			System.out.println("Digite um n�emro: ");
			num = read.nextInt();			
			if(num%2==0)
				par++;
			else
				impar++;
		}
		System.out.println("Voc� digitou "+par+" n�meros pares e "+impar+" n�meros impares");
		read.close();
		

	}

}
