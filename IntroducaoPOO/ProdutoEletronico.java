package IntroducaoPOO;

public class ProdutoEletronico {
	String nome;
	boolean gratis, internet, instalado;
	
	public void instalar()
	{
		if(internet == true) {
			System.out.println("Instalando arquivos...");
			instalado = true;
		}			
		else
			System.out.println("Erro de conex�o, verifique a internet antes de continuar");
	}
	
	public void ligarInternet() {
		internet = true;
	}
	public void desligarInternet() {
		internet = false;
	}
	
	public void gratuito()
	{
		this.gratis = true;
	}
	
	public void status() {
		System.out.println("Nome: "+this.nome);
		System.out.println("� gratuito? "+this.gratis);
		System.out.println("Internet est� conectada? "+this.internet);
		System.out.println("Foi instalado? "+this.instalado+"\n");
	}

}
