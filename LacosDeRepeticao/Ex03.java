/*
 * Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
negativo.
 */
package LacosDeRepeticao;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		double num,soma=0,media;
		int cont = 0;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um n�mero positivo para inciiar a acumula��o: ");	
		num = read.nextDouble();
		if(num > 0 ) {
			soma = num;
		}else {
			System.out.println("Voc� digitou um n�mero negativo e o programa foi finalizado!");
		}
		
		while(num >= 0 ) {
			cont++;
			System.out.print("Digite outro n�mero: ");
			num = read.nextDouble();			
			if(num > 0) {
				soma += num ;
			}
					
		}
		media = soma / cont;
		System.out.println("Voc� digitou "+cont+" numeeros poisitovs, a soma entre eles � "+soma+" e a m�dia � "+media);
		read.close();

	}

}
