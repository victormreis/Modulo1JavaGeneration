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
			System.out.println("Patinete j� est� parado.");
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
		System.out.println("A cor do patinete �: "+ this.cor);
		System.out.println("O tamanho do patinete �: "+this.tamanho);
		System.out.println("O patinete � eletrico? "+this.eletrico);
		System.out.println("Est� andando? "+this.andando);
		System.out.println("Est� liberado para andar? "+this.liberado);
	}
	
	

}
