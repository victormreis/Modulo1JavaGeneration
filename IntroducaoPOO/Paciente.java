package IntroducaoPOO;

public class Paciente {
	String nome;
	boolean alta;
	
	
	public void sair() {
		if(this.alta==true)
			System.out.println("Paciente Liberado!");
		else
			System.out.println("Paciente ainda não recebeu alta!");		
	}
	
	public void liberarPaciente() {
		this.alta=true;
	}
	
	public void status() {
		System.out.println("Paciente "+this.nome);
		System.out.println("Está liberado? " +this.alta);
	
	}

}
