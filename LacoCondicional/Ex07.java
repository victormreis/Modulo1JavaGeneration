/*
 * Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		float base,altura, area;		
		System.out.print("Digite o valor da base do triangulo: ");
		base = read.nextFloat();
		System.out.print("Digite o valor da altura do triangulo: ");
		altura = read.nextFloat();
		if(base > 0 && altura > 0) {
			area = (base * altura) /2 ;
			System.out.println("A Área do triangulo é: " + area);
		}else {
			System.out.println("Você deve digitar numeros Positivos para checar a área de um triangulo");
		}
		read.close();

	}

}
