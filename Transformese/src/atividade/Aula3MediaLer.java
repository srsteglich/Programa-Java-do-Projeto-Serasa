package atividade;

import java.util.Scanner;

public class Aula3MediaLer {
	public static void main(String[] args) {
		
		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite o 1º mês ");
		double mes1 = entra.nextDouble();
		System.out.println("Digite o 2º mês ");
		double mes2 = entra.nextDouble();
		System.out.println("Digite o 3º mês ");
		double mes3 = entra.nextDouble();
		
		double media = (mes1 + mes2 + mes3) /3;								// .2f
		System.out.printf("A média de Clientes dos últimos 3 meses foi " + media + " clientes. ");
		System.out.printf(" A media %.2f e %.2f é %.2f ", mes1, mes2, media );
		entra.close();
	}
}

