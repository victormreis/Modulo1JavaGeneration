package IntroducaoPOO;

public class ContaBancaria {
	
	String tipo, numero;
	boolean ativa;
	double saldo;
	
	public void sacar() {
		if(this.ativa == true)
			if(this.saldo>0) {
				System.out.println("Contando notas aguarde....");
				saldo = saldo -200;
			}
				
		
			else
				System.out.println("Você não tem saldo para efetuar um saque....");
		else
			System.out.println("Conta inativa, para sacar a conta precisa estar ativa!");
	
	}
	public void ativarConta() {
		ativa = true;
	}
	
	public void inativarConta() {
		ativa = false;
	}
	public void adicionarSaldo() {
		saldo = 1000;
	}
	
	public void status() {
		System.out.println("Número da conta: "+this.numero);
		System.out.println("Tipo de conta: "+this.tipo);
		System.out.println("Conta está ativa? "+this.ativa);
		System.out.println("Saldo em Conta: "+this.saldo);
	}
	
	
	

}
