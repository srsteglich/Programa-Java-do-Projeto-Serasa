package pagamento;

import java.util.Scanner;

import pessoas.Cliente;


public class Pagamento {
	public static void formaPagamento(double valorAPagar) {		
		Scanner entrada = new Scanner(System.in);
		
		Cliente.dizNomeCliente(null);
		
		System.out.println(" Qual seria a forma de pagamento? 1- Dinheiro");
		System.out.println("                                  2- Débito");
		System.out.println("                                  3- Crédito");			
		System.out.println("                                  4- PIX");			
		int formaPagamento = entrada.nextInt(); 				
		switch (formaPagamento) {
		case 1:
			System.out.println(" Será pago no dinheiro\n");
			System.out.println(" Qual será a quantia paga?");
			double quantiaEmDinheiro = entrada.nextDouble();			
			pagamentoEmDinheiro.pagoNoDinheiro(quantiaEmDinheiro, valorAPagar);			
			break;		
		case 2:
			System.out.println(" Será pago no Debito.\n");
			double quantiaEmDebito = entrada.nextDouble();		
			pagamentoEmDebito.pagoNoDebito(quantiaEmDebito, valorAPagar);			
			break;			
		case 3:
			System.out.println(" Será pago no Credito.\n");			
			System.out.println(" Quantas parcelas? Permitido em até 3 parcelas.\n");
			double quantiaEmCredito = entrada.nextDouble();			
			pagamentoEmCredito.pagoNoCredito(quantiaEmCredito, valorAPagar);			
			break;			
		case 4:
			System.out.println(" Será pago no Pix.\n");			
			System.out.println(" Qual é a cahve de um Pix? 1 - CPF");
			System.out.println("                           2 - Celular");
			System.out.println("  						   3 - E-mail");		
			double quantiaEmPix = entrada.nextDouble();			
			pagamentoEmPix.pagoNoPix(quantiaEmPix, valorAPagar);			
			break;
		default:
			break;
		}		
		

		entrada.close();		
	}
}
