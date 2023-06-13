package POO.Conta.Banco;

import POO.Conta.Contas.ContaPf;
import POO.Conta.Contas.ContaPj;

public class SistemaBanco {

	public static void main(String[] args) {		
				
		ContaPf contPf = new ContaPf();
		ContaPj conPj;
		conPj = new ContaPj();
		
		//System.out.println("  Conta Pessoa Fisica");
		contPf.abrirConta();
		contPf.setNomeTitular("João Paulo");
		contPf.setNumConta("1234567-89");
		System.out.println(" Nome Titular da Conta PF: " + contPf.getNomeTitular());
		System.out.println(" Nº da Conta: " + contPf.getNumConta() +"\n");
		
		//System.out.println("  Conta Pessoa Juridica");
		conPj.abrirContaPJ();

		conPj.setNomeTitular("Sérgio ");
		conPj.setNumConta("1111111-11");
		conPj.setNomeEmpresa("SRSistemas ");
		conPj.setNumCPNJ("963258/852");
		System.out.println(" Nome titular da PJ: " + conPj.getNomeTitular());
		System.out.println(" Nome da Empresa: " + conPj.getNomeEmpresa());
		System.out.println(" Nº da CPNJ: "+ conPj.getNumCPNJ());
		System.out.println(" Nª da Conta: "+ conPj.getNumConta());
		
		// Alteração		
		contPf.setNomeTitular("João Paulo de Oliveira");
		contPf.setNumConta("222222-22");
		
		conPj.setNomeTitular("Sérgio Renato Steglich");
		conPj.setNomeEmpresa("SRSistemas S.A.");
		conPj.setNumCPNJ("10101010/10");
		
		System.out.println("\n    Alterou as informações PF ");
		System.out.println(" Nome da PF " + contPf.getNomeTitular());
		System.out.println(" Nº da conta PF " + contPf.getNumConta());		
		System.out.println("\n --- Alterou as informações PJ ----");
		System.out.println(" Nome da PJ " + conPj.getNomeTitular());		
		System.out.println(" Nome da Empresa " + conPj.getNomeEmpresa());		
		System.out.println(" Nº do CPNJ " + conPj.getNumCPNJ());		
		
	}
}
