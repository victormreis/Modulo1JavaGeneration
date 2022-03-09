package Heranca;

public abstract class Animal {
	
	private String nome;
	private int idade;
	
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void emitirSom();
	
	public void locomover()
	{
		System.out.println("Correndo...");
	}
	
	

}
