package IntroducaoPOO;

public class Aviao {
	
	boolean voando, ligado; 
	String modelo;	
	
	
	public void voar()
	{
		if (this.ligado == true) {
			System.out.println("Avião iniciando Voo!");
			this.voando = true;
		}
			
		else
			System.out.println("O Avião precisa estar ligado para voar!");
	}
	
	public void  ligar() {
		this.ligado = true;
	}
	public void desligar() {
		this.ligado = false;
	}
	
	public void pousar() {
		if (this.voando == true)
			System.out.println("Iniciando procedimento de  pouso!\n");
		else
			System.out.println("Impossivel pousar! aeronave  já está no solo!");
	}
	
	
	public void estado() {
		System.out.println("Modelo do avião: "+this.modelo);
		System.out.println("O Avião está ligado? "+this.ligado);
		System.out.println("Aviao está voando? "+this.voando);
		
		
	}
}
