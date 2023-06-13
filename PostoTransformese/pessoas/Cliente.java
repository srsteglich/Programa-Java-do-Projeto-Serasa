package pessoas;

import java.util.Scanner;

import pagamento.Pagamento;

public class Cliente extends Pagamento{

	String nomeCliente;
	
/*	Cliente(String NomeRecebido, String SobreNomeRecebido) {
		nome = NomeRecebido;
		sobreNome = SobreNomeRecebido;
	}	*/
	
	public void pegarNomeCliente() {
		Scanner entrada = new Scanner(System.in);

		System.out.println(" Informa o teu nome?\n");
		nomeCliente = entrada.nextLine();
		entrada.close();
					
	}

	public String getNome() {
		return nomeCliente;
	}

	public void setNome(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	
	
}
