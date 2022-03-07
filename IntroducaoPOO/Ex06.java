/*
 * Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
 */
package IntroducaoPOO;

public class Ex06 {

	public static void main(String[] args) {
		ContaBancaria cliente1 = new ContaBancaria();
		ContaBancaria cliente2 = new ContaBancaria();
		
		cliente1.numero = "102030-5";
		cliente1.tipo = "Conta Corrente";
		cliente1.ativarConta();
		cliente1.adicionarSaldo();
		cliente1.sacar();
		
	
		
		cliente1.status();
		cliente2.status();

	}

}
