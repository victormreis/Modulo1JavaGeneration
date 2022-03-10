package Collections;

public class Produto {
	
	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(String nome, int cod, double valor) {
		this.nome = nome;
		this.codigo = cod;
		this.preco = valor;
	}
	
	public String toString()
	{
		return "\nProduto:"+this.nome+" \tCódigo do protudo: "+this.codigo+" \tPreço R$:"+ this.preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
