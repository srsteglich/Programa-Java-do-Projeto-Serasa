package POO.Heranca;

public class Animal {
	private String nome;
	private String cor; 		
	private String mover;
	
	public void animalMovendo() {
		System.out.println(" Animal está movendo");
	}
	public void animalEmitirSom() {
		System.out.println(" Animal está emitindo som");	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMover() {
		return mover;
	}
	public void setMover(String mover) {
		this.mover = mover;
	}
	
	
	
}
