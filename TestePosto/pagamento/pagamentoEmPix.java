package pagamento;

public class pagamentoEmPix {
	
	public static void pagoNoPix( double quantiaEmPix, double valorAPagar) {
		
		double Pix;
			
		if(quantiaEmPix == 1) {
			Pix = (valorAPagar);
			System.out.printf(" Você faz um Pix para Posto, no valor de %.2f!", Pix);
			
		}
		else if(quantiaEmPix == 2) {
			Pix = (valorAPagar);
			System.out.printf(" Você faz um Pix para Posto, no valor de %.2f!", Pix);
		}
		else if(quantiaEmPix == 3) {
			Pix = (valorAPagar);
			System.out.printf(" Você faz um Pix para Posto, no valor de %.2f!", Pix);
		}
		else {
			System.out.println(" Pix Inválido! Tente novamente em outro Pix");
			
		}
	}

}
