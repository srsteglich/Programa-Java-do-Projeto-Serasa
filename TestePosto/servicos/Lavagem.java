package servicos;

import pagamento.Pagamento;

public class Lavagem {
	public static void Lavar(int tamanhoCarro, double opcaoLavagem) {	
		double carroPequeno = 20.00;
		double carroMedio = 30.00;
		double carroGrande = 40.00;		
		double valorAPagar;
		String tamCarro;
		String opcLavar;		
		if (tamanhoCarro == 1) {
			if (opcaoLavagem ==1) {
				valorAPagar = carroPequeno + 15;
				opcLavar = "por dentro";	
			} else {
				valorAPagar = carroPequeno;
				opcLavar = "somente por fora";	
			}	
			tamCarro = "Pequeno";
		} else if (tamanhoCarro ==2) {
			if (opcaoLavagem ==1) {
				valorAPagar = carroMedio + 15;
				opcLavar = "por dentro";	
			} else {
				valorAPagar = carroMedio;
				opcLavar = "somente por fora";
			}
			tamCarro = "Médio";
		} else {
			if (opcaoLavagem ==1) {
				valorAPagar = carroGrande + 15;
				opcLavar = "por dentro";	
			} else {
				valorAPagar = carroGrande;
				opcLavar = "somente por fora";
			}		
			tamCarro = "Grande";
		}							
		System.out.printf(" O carro foi lavado por R$ %.2f, com a lavagem %s do carro tamanho %s.\n",valorAPagar, opcLavar, tamCarro);		
		Pagamento.formaPagamento(valorAPagar);
	}
}
