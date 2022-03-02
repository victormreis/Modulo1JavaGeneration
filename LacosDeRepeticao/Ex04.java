/*
 * Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por
tr�s (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio
digita 5, deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
 */
package LacosDeRepeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		System.out.print("Digite um n�mero: ");
		num = read.nextInt();
		System.out.print(num);
		while(num < 100) {
			num = num *3;
			System.out.print("\t"+num);
		}
		read.close();

	}

}
