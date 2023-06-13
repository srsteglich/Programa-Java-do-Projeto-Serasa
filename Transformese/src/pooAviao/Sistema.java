package pooAviao;

public class Sistema {

	public static void main(String[] args) {
		
		Piloto pil1 = new Piloto();
		Piloto pil2 = new Piloto();		
		pil1.nome ="Ariel";
		pil1.sobreNome = "Xavier";
		pil2.nome = "Tati";
		pil2.sobreNome = "Martins";
				
		System.out.println(pil1.nome);
		System.out.println(pil1.sobreNome);
		
		Aviao avi1 = new Aviao();		
		avi1.fabricante = "Emtraer";
		avi1.modelo = "111-AAA";
		avi1.passageiros = 50;
		avi1.qtdeMotores = 2;
		avi1.piloto = pil1;
		
		Aviao avi2 = new Aviao();
		avi2.fabricante = "Emtraer";
		avi2.modelo = "222-AAA";
		avi2.passageiros = 80;
		avi2.qtdeMotores = 4;
		avi2.piloto = pil2;
		
		System.out.println("");
		System.out.println("Dados aviao 1");
		System.out.println(avi1.modelo);
		System.out.println(avi1.piloto.nome);
		System.out.println("");
		System.out.println("Dados aviao 2");
		System.out.println(avi2.modelo);
		System.out.println(avi2.piloto.nome);
		
	}

}
