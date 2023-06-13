package pagamento;

public class pagamentoEmCredito {
	
	public static void pagoNoCredito( double quantiaEmCredito, double valorAPagar) {
		
		double parcela;
		
		if(quantiaEmCredito == 1) {
			parcela = (valorAPagar);
			System.out.printf(" Pago a vista de %2.f!", parcela);
			
		}
		else if(quantiaEmCredito == 2) {
			parcela = (valorAPagar/2);
			System.out.printf(" Está pago em duas parcelas de %.2f!", parcela);
		}
		else if(quantiaEmCredito == 3) {
			parcela = (valorAPagar/3);
			System.out.printf(" Está pago em três parcelas de %.2f!", parcela);
		}
		else { 
			System.out.println(" Parcela Inválida! Tente novamente em outra parcela");
			
		}
	}

}
