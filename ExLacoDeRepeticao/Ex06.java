/*
 * Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int num, media=0,cont=0;
		Scanner read = new Scanner(System.in);
		System.out.println("Acumulador de números, digite um número e para finalizar digite 0");
		do {
			System.out.print("Digite um número: ");
			num = read.nextInt();
			media += num;
			cont++;
		}while(num != 0);
		System.out.println("Você digitou "+(cont-1)+" números e a média entre eles foi: "+(media/(cont-1)));
		read.close();
			

	}

}
