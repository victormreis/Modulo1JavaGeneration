/*
 * Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
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
		System.out.println("A soma de todos os n�meros impares multiplos de 3 entre 1 e 500 �: "+soma);

	}

}
