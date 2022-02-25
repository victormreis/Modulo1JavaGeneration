/* Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é:*/

package Introducao;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		double x1, x2, y1, y2, distancia, resy, resx;
		System.out.println("Calculadora de distancia entre  pontos");
		System.out.print("Digite os valores do primeiro Ponto: ");
		x1 = read.nextDouble();
		y1 = read.nextDouble();
		System.out.print("Digite os valores do segundo Ponto: ");
		x2 = read.nextDouble();
		y2 = read.nextDouble();
		resx = Math.pow(x2 - x1 , 2);
		resy = Math.pow(y2 - y1 , 2);
		distancia = Math.sqrt(resx + resy);
		System.out.println("A distancia entre os pontos é: " +distancia);
		
		read.close();
		
		
		
		
	}

}
