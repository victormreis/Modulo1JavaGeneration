/*
 * Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package IntroducaoPOO;

public class Ex07 {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente();
		
		p1.nome = "José Carlos";
		p1.liberarPaciente();
		p1.status();
		p1.sair();		
		p2.nome = "Ana Claudia";		
		p2.status();
		p2.sair();

	}

}
