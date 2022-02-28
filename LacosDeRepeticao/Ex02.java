/*
 * Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 */
package LacosDeRepeticao;

public class Ex02 {

	public static void main(String[] args) {
		int soma =0;
		
		for(int i = 3; i <= 500;i=i+3) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println("A soma de todos os números impares multiplos de 3 entre 1 e 500 é: "+soma);

	}

}
