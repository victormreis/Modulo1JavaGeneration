/*
 * Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package IntroducaoPOO;

public class Ex01 {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.nome = "Victor";
		c1.codigo = 1;
		c1.adicionarSaldo();
		c1.telefone = "11-9999-8888";
		c1.olharProduto();
		c1.comprar();
		c1.removerSaldo();		
		c1.estado();
		c2.estado();
		
		
	}

}
