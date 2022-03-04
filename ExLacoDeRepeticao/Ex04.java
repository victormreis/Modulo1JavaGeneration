/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)

1- o número de pessoas calmas;
6- o número de pessoas calmas com menos de 18 anos.
4- o número de outros calmos;


2- o número de mulheres nervosas;
5- o número de pessoas nervosas com mais de 40 anos;


3- o número de homens agressivos;


 */
package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);		
		int idade, sexo, opcoes, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervososMaior=0, calmasMenor=0;
		System.out.println("Entre com os dados Solicitados conforme instrução!");		
		for(int i=1;i<=150;i++) {
			System.out.print("Digita sua idade: ");
			idade=read.nextInt();
			System.out.print("Digite um numero para representar seu sexo ([1]-feminino / [2]-masculino / [3]-Outros): ");
			sexo = read.nextInt();
			System.out.print("Digite um numero para representar sua opção (1-calma / 2-nervosa / 3-Agressiva): ");
			opcoes= read.nextInt();
			if(opcoes == 1) {
				pessoasCalmas++;
				if(idade <18)
					calmasMenor++;
				else if(sexo == 3)
					outrosCalmos++;				
			}
			if(opcoes==2) {
				if(sexo == 1)
					mulheresNervosas++;
				if(idade>=40)
					nervososMaior++;				
			}
			if(sexo == 2 && opcoes ==3)
				homensAgressivos++;							
		}
		System.out.println("A quantidade de pessoas calmas é "+pessoasCalmas);
		System.out.println("O número de mulheres nervosas é "+mulheresNervosas);
		System.out.println("O número de homens agressivos é "+homensAgressivos);
		System.out.println("O número de 'outros' calmos é "+outrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é "+nervososMaior);
		System.out.println("O número de pessoas calmas com menos de 18 anos é "+calmasMenor);	
		read.close();
	}
}
