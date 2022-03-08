package Heranca;

public class Cachorro extends Animal {
	private boolean correr = false;
	
	
	public void correr() {
		this.correr = true;
		System.out.println("O animal está correndo!");
		
	}
	public void parado() {
		if(this.correr == true) {
			this.correr = false;
			System.out.println("O animal está parado!");
		}else
			System.out.println("O animal já está parado!");
	}
	

}
