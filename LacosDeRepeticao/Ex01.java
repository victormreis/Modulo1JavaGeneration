/*
 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:��
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$100,00.

 */
package LacosDeRepeticao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double salario, maiorSalario = 0, totalSalario =0, mediaSalario = 0, totalFilhos =0, mediaFilhos =0, salarioBaixo =0;
		int filhos;
		for(int i=1;i<=20;i++) {
			System.out.print("Digite o salario do "+i + "� morador R$: ");
			salario = read.nextDouble();
			totalSalario += salario;
			System.out.print("N�mero de filhos do "+i+"� morador: ");
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
		System.out.println("A media salarial da popula��o � R$ "+mediaSalario);
		System.out.println("A media de filhos por habitante �: "+mediaFilhos);
		System.out.println("O maior salario registrado foi R$ "+maiorSalario);
		System.out.println("A parcela da popula��o que ganha 100 R$ ou menos � de "+(salarioBaixo / 20) * 100+" % da popula��o");
		read.close();
	}

}
