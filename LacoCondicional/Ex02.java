/*
 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float  n, s, e =0;
		int c;
		System.out.print("Digite o código do funcionario: ");
		c = read.nextInt();
		System.out.print("Digite o numero de horas trabalhadas do funcionario: ");
		n = read.nextFloat();
		if(n>50) {
			e = n - 50;
			s = (n - e) * 10;
			System.out.println("O funcionario código: " + c + ", irá receber R$: " + s + " de salario base + RS:"+ (e *20)+ " de extras.");
			System.out.println("Salario total a receber R$: " + (s + (e*20)));
			
		}else {
			s = n * 10;
			System.out.println("O funcionario código: " + c + ", irá receber R$: " + s + " de salario base + RS:"+ e + " de extras.");
			System.out.println("Salario total a receber R$: " + s );
		}
		
		read.close();
		
	}
	
	

}
