package IntroducaoPOO;

public class Aviao {
	
	boolean voando, ligado; 
	String modelo;	
	
	
	public void voar()
	{
		if (this.ligado == true) {
			System.out.println("Avi�o iniciando Voo!");
			this.voando = true;
		}
			
		else
			System.out.println("O Avi�o precisa estar ligado para voar!");
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
			System.out.println("Impossivel pousar! aeronave  j� est� no solo!");
	}
	
	
	public void estado() {
		System.out.println("Modelo do avi�o: "+this.modelo);
		System.out.println("O Avi�o est� ligado? "+this.ligado);
		System.out.println("Aviao est� voando? "+this.voando);
		
		
	}
}
