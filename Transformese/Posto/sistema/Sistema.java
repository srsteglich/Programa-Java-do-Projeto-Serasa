package sistema;

import java.util.Scanner;

import pagamento.Pagamento;
import servicos.Abastecimento;
import servicos.Lavagem;

public class Sistema {
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
						
		System.out.println(" Olá, Seja Bem-vindo ao Posto Transforme-se");
		
		System.out.println(" Qual serviço deseja fazer? ");
		System.out.println("      1- Abastecer");
		System.out.println("      2- Trocar óleo");
		System.out.println("      3- Lavar carro");
		int escolhaCliente = entrada.nextInt();
		
		if (escolhaCliente == 1) {
			System.out.println(" O preço dos combustiveis: 1- Gasolina R$ 4.75");
			System.out.println("                           2- Etanol R$ 3.85");
			System.out.println("                           3- Diesel R$ 5.15");
			System.out.println(" Qual combustivel gostaria de abastecer?");
			int tipoCombustivel = entrada.nextInt();
			
			System.out.println(" Quanto gostaria abastecer em Reais?");
			double valorAbastecer = entrada.nextDouble();
		
			Abastecimento.Abastecer(tipoCombustivel, valorAbastecer);

// esse mais lá pra baixo, depois de lavar carro.			
			System.out.println(" Qual seria a forma de pagamento? 1- Dinheiro");
			System.out.println("                                  2- Débito");
			System.out.println("                                  3- Crédito");			
			System.out.println("                                  4- PIX");			
			int formaPagamento = entrada.nextInt();
		
			Pagamento.formaPagamento(formaPagamento, valorAbastecer);
						
		} else if (escolhaCliente == 2) {
				// Trocar oleo
			
		} else if (escolhaCliente == 3) {				
			System.out.println(" Qual o tamanho do veículo? 1- Pequeno R$ 20,00");
			System.out.println("                            2- Médio R$ 30,00");
			System.out.println("                            3- Grande R$ 40,00");	
			int tamanhoCarro = entrada.nextInt();
			
			System.out.println(" Opção de lavagem? 1- Por dentro R$ 15,00");
			System.out.println("                   2- Somente por fora");
			int opcaoLavagem = entrada.nextInt();

			Lavagem.Lavar(tamanhoCarro, opcaoLavagem);	
			
		} else {
			System.out.println(" Escolheu opção errado...");
		}
		
		
		entrada.close();
	}
}
