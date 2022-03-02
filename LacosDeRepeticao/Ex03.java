/*
 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
 */
package LacosDeRepeticao;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		double num,soma=0,media;
		int cont = 0;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um número positivo para inciiar a acumulação: ");	
		num = read.nextDouble();
		if(num > 0 ) {
			soma = num;
		}else {
			System.out.println("Você digitou um número negativo e o programa foi finalizado!");
		}
		
		while(num >= 0 ) {
			cont++;
			System.out.print("Digite outro número: ");
			num = read.nextDouble();			
			if(num > 0) {
				soma += num ;
			}
					
		}
		media = soma / cont;
		System.out.println("Você digitou "+cont+" numeeros poisitovs, a soma entre eles é "+soma+" e a média é "+media);
		read.close();

	}

}
