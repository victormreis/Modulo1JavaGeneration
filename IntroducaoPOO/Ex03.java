/*
 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
 */
package IntroducaoPOO;

public class Ex03 {

	public static void main(String[] args) {
		ProdutoEletronico lol = new ProdutoEletronico();
		ProdutoEletronico csgo = new ProdutoEletronico();
		
		lol.nome = "League of Legends";
		csgo.nome = "Counter Strike Global Ofensive";
		
		lol.gratuito();
		lol.ligarInternet();
		lol.instalar();		
		lol.status();			
		
		csgo.status();
		csgo.instalar();
		

	}

}
