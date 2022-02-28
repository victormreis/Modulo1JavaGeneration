/*
 * A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente.
 O índice de poluição aceitável varia de 0,05 até 0,25. 
 Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
 se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
 Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float indice; 
		System.out.println("Digite o valor do indice de poluição: ");
		indice = read.nextFloat();
		if(indice <= 0.29) {
			System.out.println("ATENÇAO EMPRESAS DOS GRUPOS 1, 2 E 3: Atividades Liberadas, até nova comunicação");
		}else if(indice >= 0.3 && indice < 0.4) {
			System.out.println("ATENÇÂO EMPRESAS DO GRUPO 1: Vocês devem suspspender suas atividades imediatamente, até nova comunicação!");
		}else if (indice >= 0.4 && indice < 0.5) {
			System.out.println("ATENÇÂO EMPRESAS DOS GRUPOS 1 e 2: Vocês devem suspspender suas atividades imediatamente, até nova comunicação!");
		}else {
			System.out.println("ATENÇÂO EMPRESAS DOS GRUPOS 1, 2 E 3: Vocês devem suspspender suas atividades imediatamente, até nova comunicação!");
		}
		read.close();

	}

}
