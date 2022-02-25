/*
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */

package Introducao;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double custoFabrica, custoConsumidor;
		System.out.print("Digite o Custo de fabrica do veiculo: ");
		custoFabrica = read.nextDouble();
		custoConsumidor = custoFabrica + (custoFabrica * 0.73);
		System.out.println("O custo final para o consumidor será R$: " + custoConsumidor );
		
		read.close();
		
	}

}
