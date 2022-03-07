/*
 * Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.
 */
package IntroducaoPOO;

public class Ex04 {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.nome = "José Alves";
		func1.codigo = 1099;
		func1.departamento = "Produção";
		func1.ativarFuncionario();
		func1.baterPonto();		
		func1.status();
		
		func2.baterPonto();
		func2.status();

	}

}
