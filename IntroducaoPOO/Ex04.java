/*
 * Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
 */
package IntroducaoPOO;

public class Ex04 {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.nome = "Jos� Alves";
		func1.codigo = 1099;
		func1.departamento = "Produ��o";
		func1.ativarFuncionario();
		func1.baterPonto();		
		func1.status();
		
		func2.baterPonto();
		func2.status();

	}

}
