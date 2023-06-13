package pagamento;

public class PagamentoDinheiro {
	
	public static void pagamentoEmDinheiro(double quantiaEmDinheiro, double valorAbastecido) {
		
		if (quantiaEmDinheiro == valorAbastecido) {
			System.out.println(" Obrigado!!!");
		} else if (quantiaEmDinheiro > valorAbastecido) {
			double troco = quantiaEmDinheiro - valorAbastecido;
			System.out.printf(" O seu troco é de %.2f, agradecimentos a preferência.",troco);
		} else if (quantiaEmDinheiro < valorAbastecido ) {
			System.out.println(" Fiado só amanhã!");
		}
		
		
		
	}	
}
