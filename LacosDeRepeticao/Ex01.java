/*
 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.

 */
package LacosDeRepeticao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double salario, maiorSalario = 0, totalSalario =0, mediaSalario = 0, totalFilhos =0, mediaFilhos =0, salarioBaixo =0;
		int filhos;
		for(int i=1;i<=20;i++) {
			System.out.print("Digite o salario do "+i + "º morador R$: ");
			salario = read.nextDouble();
			totalSalario += salario;
			System.out.print("Número de filhos do "+i+"º morador: ");
			filhos = read.nextInt();
			totalFilhos += filhos;
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			if(salario <= 100) {
				salarioBaixo++;
			}
		}
		mediaSalario= totalSalario / 20;
		mediaFilhos = totalFilhos / 20;
		System.out.println("A media salarial da população é R$ "+mediaSalario);
		System.out.println("A media de filhos por habitante é: "+mediaFilhos);
		System.out.println("O maior salario registrado foi R$ "+maiorSalario);
		System.out.println("A parcela da população que ganha 100 R$ ou menos é de "+(salarioBaixo / 20) * 100+" % da população");
		read.close();
	}

}
