package pagamento;

import java.util.Scanner;

public class Pagamento {

	public static void formaPagamento(int formaEscolhido, double valorAbastecido) {
		
		Scanner entrada = new Scanner(System.in);
		
		switch (formaEscolhido) {
		case 1: System.out.println(" Será pago em dinheiro");
				System.out.println(" Qual será a quantia pagar?");
				double quantiaEmDinheiro = entrada.nextDouble();
				
				// vai lá no metodo e volta
				PagamentoDinheiro.pagamentoEmDinheiro(quantiaEmDinheiro, valorAbastecido);							
			break;
		case 3: System.out.println(" Será pago em dinheiro");
				System.out.println(" Qual será a quantia pagar?");
				 quantiaEmDinheiro = entrada.nextDouble();
		
				// vai lá no metodo e volta
	//			PagamentoEmDinheiroLavagem.Lavar2(quantiaEmDinheiro, gastoLavagem); 
				                               
			
		default:
			break;
		}
	
		entrada.close();
	}	
}
