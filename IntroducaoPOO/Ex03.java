/*
 * Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
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
