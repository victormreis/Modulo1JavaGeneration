/*
 * Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos
(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
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
			System.out.println("A �rea do triangulo �: " + area);
		}else {
			System.out.println("Voc� deve digitar numeros Positivos para checar a �rea de um triangulo");
		}
		read.close();

	}

}
