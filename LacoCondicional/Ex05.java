/*
 * A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
ind�strias que s�o altamente poluentes do meio ambiente.
 O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. 
 Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, 
 se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, 
se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
 Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float indice; 
		System.out.println("Digite o valor do indice de polui��o: ");
		indice = read.nextFloat();
		if(indice <= 0.29) {
			System.out.println("ATEN�AO EMPRESAS DOS GRUPOS 1, 2 E 3: Atividades Liberadas, at� nova comunica��o");
		}else if(indice >= 0.3 && indice < 0.4) {
			System.out.println("ATEN��O EMPRESAS DO GRUPO 1: Voc�s devem suspspender suas atividades imediatamente, at� nova comunica��o!");
		}else if (indice >= 0.4 && indice < 0.5) {
			System.out.println("ATEN��O EMPRESAS DOS GRUPOS 1 e 2: Voc�s devem suspspender suas atividades imediatamente, at� nova comunica��o!");
		}else {
			System.out.println("ATEN��O EMPRESAS DOS GRUPOS 1, 2 E 3: Voc�s devem suspspender suas atividades imediatamente, at� nova comunica��o!");
		}
		read.close();

	}

}
