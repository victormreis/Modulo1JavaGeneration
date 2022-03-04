/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num, par=0,impar=0;
		for(int i=1;i<=10;i++) {
			System.out.println("Digite um núemro: ");
			num = read.nextInt();			
			if(num%2==0)
				par++;
			else
				impar++;
		}
		System.out.println("Você digitou "+par+" números pares e "+impar+" números impares");
		read.close();
		

	}

}
