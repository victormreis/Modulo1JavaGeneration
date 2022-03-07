/*
 * Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package IntroducaoPOO;

public class Ex05 {

	public static void main(String[] args) {
		Patinete pat1 = new Patinete();
		Patinete pat2 = new Patinete();
		
		pat1.cor = "Azul";
		pat1.tamanho = "Grande";
		pat1.automatico();
		pat1.liberar();
		pat1.andar();
		
		pat1.status();
		pat2.status();
		pat2.andar();
		pat2.parar();
		
		
	

	}

}
