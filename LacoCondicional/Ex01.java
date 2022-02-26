/*
 * João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float p,e=0,m=0;		
		System.out.print("Digite o peso dos tomates em KG: ");
		p = read.nextFloat();
		if(p > 50) {
			e = p - 50;
			m = e * 4;
			System.out.println("Você excedeu o limite de peso estabelecido pelo estado de São paulo que é de 50KG!");
			System.out.println("Excesso: " +e +" Kilos" + " Multa por excesso R$ " + m);
		} else {
			System.out.println("O peso está dentro do limite estabelecido pelo estado de São Paulo!");
			System.out.println("Excesso: " +e +" Kilos" + " Multa por excesso R$ " + m);
		}
		read.close();
		
	}

}
