package IntroducaoPOO;

public class Funcionario {
	String nome, departamento;
	int codigo;
	boolean ativo;
	
	public void baterPonto()
	{
		if (this.ativo == true)
			System.out.println("Bem vindo tenha um bom dia de trabalho");
		else
			System.out.println("Funcionario inativo, para bater ponto é necessario estar ativo");
	}
	
	public void ativarFuncionario()
	{
		this.ativo = true;
		
	}
	
	public  void desativarFuncionario()
	{
		this.ativo = false;
			
	}
	
	public void status () {
		System.out.println("Nome: "+this.nome);
		System.out.println("Numero de registro: "+this.codigo);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("O funcionario está ativo? "+this.ativo +"\n");
	}
	

}
