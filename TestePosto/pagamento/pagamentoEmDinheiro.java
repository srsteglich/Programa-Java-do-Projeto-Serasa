package pagamento;

public class pagamentoEmDinheiro {

	public static void pagoNoDinheiro(double quantiaEmDinheiro, double valorAPagar) {
		
		if (quantiaEmDinheiro == valorAPagar) {
			System.out.println(" Obrigado, boa viagem!");
			
		} else if (quantiaEmDinheiro > valorAPagar) {
			double troco = quantiaEmDinheiro - valorAPagar;
			
			System.out.println(" Troco: "+troco);
			System.out.println(" Quanto em Dinheiro: "+quantiaEmDinheiro);

			
			System.out.printf(" O seu troco é de %.2f, agradecemos a preferência.", troco);
			
		} else if (quantiaEmDinheiro < valorAPagar) {
			System.out.println(" Fiado só amanhã!");
			
		}
		
	}
}