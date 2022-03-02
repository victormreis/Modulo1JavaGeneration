/*
 * Faça um programa que mostre uma contagem na tela de 233 a 456, só que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */
package LacosDeRepeticao;

public class Ex05 {
	public static void main(String[] args) {
		int cont = 233;
		
		do {
			if(cont >= 300 && cont <= 400) {
				System.out.println(cont);
				cont += 3;
			}else {
				System.out.println(cont);
				cont += 5;
			}
			
		}while(cont <= 456); 
			
		
		
	}

}
