/*
 * Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
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
