package pagamento;

public class PagamentoEmDinheiroLavagem {

	public static void Lavar2(double quantiaEmDinheiro, double gastoLagavem) {
  
		if (quantiaEmDinheiro == gastoLagavem) {
			System.out.println(" Obrigado!!!");
		} else if (quantiaEmDinheiro > gastoLagavem) {
			double troco = quantiaEmDinheiro - gastoLagavem;
			System.out.printf(" O seu troco é de %.2f, agradecimentos a preferência.",troco);
		} else if (quantiaEmDinheiro < gastoLagavem ) {
			System.out.println(" Fiado só amanhã!");
		}
		

	}

}
