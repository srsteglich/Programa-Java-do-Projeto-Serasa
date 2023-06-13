package POO.Heranca;

public class Sistema {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		
		animal1.setNome("peixe");
		animal1.setCor("cinza");
		animal1.setMover("nando");
		animal1.animalMovendo();
		animal1.animalEmitirSom();
		
		System.out.println(" "+ animal1.getNome());
		System.out.println(" " + animal1.getCor());
		
		Cachorro cao1 = new Cachorro();
		
		System.out.println(" ----   Dados o cachorro  ------");
		cao1.setNome(" Caramelo");
		cao1.setCor(" Preto");
		cao1.setMover(" Correndo");
		cao1.correr();
		cao1.latir();
		// Herdou na classe animal
		cao1.animalMovendo();
		cao1.animalEmitirSom();
		
		
		System.out.println("" + cao1.getNome());
		System.out.println(""+ cao1.getCor());
		
		
		System.out.println("" + cao1.getMover());
	}
}
