package IntroducaoPOO;

public class Cliente {
	String nome, telefone;
	int codigo;
	boolean dinheiro;
	
	
	
	public void comprar()
	{
		if (this.dinheiro == true)
			System.out.println("Comprou");
		else
			System.out.println("Saldo insuficiente");
	}
	
	public void olharProduto()
	{
		System.out.println("Olhando Produtos");
	}
	
	public void adicionarSaldo()
	{
		this.dinheiro = true;
	}
	public void removerSaldo()
	{
		this.dinheiro = false;
	}
	
	public void estado()
	{
		System.out.println("Nome: " +this.nome);
		System.out.println("Telefone: " +this.telefone);
		System.out.println("Código do cliente: " +this.codigo);
		System.out.println("Tem dinheiro? " + this.dinheiro);
	}
	

}
