/*
 * Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
excedente.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float  n, s, e =0;
		int c;
		System.out.print("Digite o c�digo do funcionario: ");
		c = read.nextInt();
		System.out.print("Digite o numero de horas trabalhadas do funcionario: ");
		n = read.nextFloat();
		if(n>50) {
			e = n - 50;
			s = (n - e) * 10;
			System.out.println("O funcionario c�digo: " + c + ", ir� receber R$: " + s + " de salario base + RS:"+ (e *20)+ " de extras.");
			System.out.println("Salario total a receber R$: " + (s + (e*20)));
			
		}else {
			s = n * 10;
			System.out.println("O funcionario c�digo: " + c + ", ir� receber R$: " + s + " de salario base + RS:"+ e + " de extras.");
			System.out.println("Salario total a receber R$: " + s );
		}
		
		read.close();
		
	}
	
	

}
