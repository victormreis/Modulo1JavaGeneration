/*
 * Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
 */
package LacosDeRepeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		System.out.print("Digite um número: ");
		num = read.nextInt();
		System.out.print(num);
		while(num < 100) {
			num = num *3;
			System.out.print("\t"+num);
		}
		read.close();

	}

}
