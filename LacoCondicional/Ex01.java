/*
 * Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
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
			System.out.println("Voc� excedeu o limite de peso estabelecido pelo estado de S�o paulo que � de 50KG!");
			System.out.println("Excesso: " +e +" Kilos" + " Multa por excesso R$ " + m);
		} else {
			System.out.println("O peso est� dentro do limite estabelecido pelo estado de S�o Paulo!");
			System.out.println("Excesso: " +e +" Kilos" + " Multa por excesso R$ " + m);
		}
		read.close();
		
	}

}
