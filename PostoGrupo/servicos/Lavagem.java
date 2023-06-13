package servicos;

public class Lavagem {
	public static void Lavar(int tamanhoCarro, int opcaoLavagem) {
		double carroPequeno = 20.00;
		double carroMedio = 30.00;
		double carroGrande = 40.00;
		double gastoLagavem;
		String tamCarro;
		String opcLavar;
		
		if (tamanhoCarro == 1) {
			if (opcaoLavagem ==1) {
				gastoLagavem = carroPequeno + 15;
				opcLavar = "por dentro";	
			} else {
				gastoLagavem = carroPequeno;
				opcLavar = "somente por fora";	
			}	
			tamCarro = "Pequeno";
		} else if (tamanhoCarro ==2) {
			if (opcaoLavagem ==1) {
				gastoLagavem = carroMedio + 15;
				opcLavar = "por dentro";	
			} else {
				gastoLagavem = carroMedio;
				opcLavar = "somente por fora";
			}
			tamCarro = "Médio";
		} else {
			if (opcaoLavagem ==1) {
				gastoLagavem = carroGrande + 15;
				opcLavar = "por dentro";	
			} else {
				gastoLagavem = carroGrande;
				opcLavar = "somente por fora";
			}		
			tamCarro = "Grande";
		}
								// 
		System.out.printf(" O carro foi lavado por R$ %.2f, com a lavagem %s do carro tamanho %s.\n",gastoLagavem, opcLavar, tamCarro);
	}
}
