package Heranca;

public class Preguica extends Animal {
	private boolean arvore;
	
	
	public void subirEmArvores() {
		if(this.arvore== false) {
			this.arvore = true;
			System.out.println("A preguiça subiu na arvore");
		}else
			System.out.println("A preguiça já está na arvoré");
	}
	
	public void descerDaArvore() {
		if(this.arvore == true) {
			this.arvore = false;
			System.out.println("A preguiçã desceu da arvore");
		}else
			System.out.println("A preguiça não está na arvore");
	}

}
