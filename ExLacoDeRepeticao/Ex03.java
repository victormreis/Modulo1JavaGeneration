/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int idade=0, menor=0, maior=0;
		
		while(idade!=-99) {
			System.out.print("Digite a sua idade: ");
			idade = read.nextInt();
			if(idade <21 )
				menor++;
			else
				maior++;
			
		}
		System.out.println("Temos "+(menor-1)+" pessoas com menos de 21 anos e "+maior+" pessoas com mais de 50 anos");
		
		
		read.close();

	}

}
