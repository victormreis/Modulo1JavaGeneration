/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int num, media=0,cont=0;
		Scanner read = new Scanner(System.in);
		System.out.println("Acumulador de n�meros, digite um n�mero e para finalizar digite 0");
		do {
			System.out.print("Digite um n�mero: ");
			num = read.nextInt();
			media += num;
			cont++;
		}while(num != 0);
		System.out.println("Voc� digitou "+(cont-1)+" n�meros e a m�dia entre eles foi: "+(media/(cont-1)));
		read.close();
			

	}

}
