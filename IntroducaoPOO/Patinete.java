package IntroducaoPOO;

public class Patinete {
	String cor, tamanho;
	boolean eletrico, liberado, andando;
	
	public void andar() {
		if(this.liberado == true) {
			System.out.println("Andando...");
			this.andando = true;
		}
			
		else
			System.out.println("Para andar o patinete precisa ser liberado!");	

	}
	public void parar() {
		if(this.andando == true) {
			System.out.println("Parando Patinete!");
			andando = false;
			
		}else
			System.out.println("Patinete já está parado.");
	}
	
	public void automatico() {
		eletrico = true;
	}		
	
	public void liberar() {
		this.liberado = true;
		
	}
	public void bloquear() {
		this.liberado = false;
	}
	
	public void status() {
		System.out.println("A cor do patinete é: "+ this.cor);
		System.out.println("O tamanho do patinete é: "+this.tamanho);
		System.out.println("O patinete é eletrico? "+this.eletrico);
		System.out.println("Está andando? "+this.andando);
		System.out.println("Está liberado para andar? "+this.liberado);
	}
	
	

}
