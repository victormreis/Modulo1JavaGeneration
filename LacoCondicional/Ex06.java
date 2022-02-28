/*
 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
 */
package LacoCondicional;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int idade; 
		System.out.print("Digite a idade do atleta para verificar sua categoria: ");
		idade = read.nextInt();
		if (idade < 5) {
			System.out.println("O nadador é muito jovem para participar de uma categoria!");
		}else if(idade >= 5 && idade <= 7) {
			System.out.println("Categoria Infantil A ");			
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("Categoria Infantil B ");			
		}else if(idade >= 12 && idade <=13) {
			System.out.println("Categoria Juvenil A ");			
		}else if(idade >= 14 && idade <=17) {
			System.out.println("Categoria Juvenil B ");			
		}else {
			System.out.println("Categoria Adultos");
		}
		read.close();
	}

}
