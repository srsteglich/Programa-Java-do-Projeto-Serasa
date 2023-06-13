package atividade;


import java.util.Scanner;


public class JurosMultas {
	
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		System.out.println("Digite o valor da parcela: ");
		double valor = entra.nextDouble();	
		System.out.println("Digite a data do vencimento: 8/02/2023");
		System.out.println("Digite a data do pagamento: 7/02/2023");
		int dtvenc = 8;
		int dtpgto = 7;
		int dias = dtpgto - dtvenc;
		System.out.printf("Quantos dias de atraso: " +dias+ " dias \n");
		
		System.out.println(" --------------- Banco SRS --------------- ");
		
		if  (dias >= 10) {
			valor = valor + (1.5 * dias);      
			System.out.printf("Valor a pagar é R$ %.2f%n",valor);
			System.out.printf("Pagamento com juros a multa, com "+ dias +" dias de atraso.");		
		}else if(dias <= 10 && dias > 0) {
			valor = valor + (1 * dias);
			System.out.printf("Valor a pagar é R$ %.2f%n",valor);
			System.out.printf("Pagamento com juros a multa, com "+ dias +" dias de atraso.");					 
		}else  {
			System.out.println("Valor a pagar é R$ "+valor+". Pagamento sem juros da multa.");			
		}								
		
		entra.close();							
	}	
}
