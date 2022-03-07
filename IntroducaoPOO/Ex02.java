/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
 */
package IntroducaoPOO;

public class Ex02 {

	public static void main(String[] args) {
		Aviao boeing = new Aviao();
		Aviao airbus = new Aviao();		
		
		boeing.modelo = "737 Max";
		airbus.modelo = "A 380";
		
		boeing.ligar();
		boeing.voar();		
		
		boeing.estado();
		boeing.pousar();
		
		airbus.estado();
		airbus.desligar();
		airbus.pousar();
		

	}

}
