/*
 * Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		System.out.print("Digite um número: ");
		n = read.nextInt();
		if (n > 100) {
			System.out.println("O valor digitado foi: "+n);
		}else {
			n = 0;
			System.out.println("O numero agora vale: "+n);
		}
		read.close();
		

	}

}
