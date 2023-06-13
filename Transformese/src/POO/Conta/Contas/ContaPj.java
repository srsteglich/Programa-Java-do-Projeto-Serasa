package POO.Conta.Contas;

public class ContaPj {
	private String nomeTitular;
	private String numConta;
	private String nomeEmpresa;
	private String numCPNJ;
	
	public void abrirContaPJ() {
		System.out.println("  --- Conta da Pessoa Juridica --- ");
	}

	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getNumCPNJ() {
		return numCPNJ;
	}
	public void setNumCPNJ(String numCPNJ) {
		this.numCPNJ = numCPNJ;
	}
	
	

	
	
}
