package Heranca;

public class Preguica extends Animal {
	private boolean arvore;
	
	
	public void subirEmArvores() {
		if(this.arvore== false) {
			this.arvore = true;
			System.out.println("A pregui�a subiu na arvore");
		}else
			System.out.println("A pregui�a j� est� na arvor�");
	}
	
	public void descerDaArvore() {
		if(this.arvore == true) {
			this.arvore = false;
			System.out.println("A pregui�� desceu da arvore");
		}else
			System.out.println("A pregui�a n�o est� na arvore");
	}

}
