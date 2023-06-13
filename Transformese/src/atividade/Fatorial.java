package atividade;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		
		System.out.print("Digite o valor para Fatorial: ");
		int n = entra.nextInt();
		if (n < 0) {
			System.out.println("Entrada Invalida!!! ");
			System.exit(0);			
		}
		System.out.print("Os números do fatorial: ");
		
		long fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
			System.out.print(i + " ");
		}
		System.out.println(" ");
		System.out.println("O fatorial de " + n + " é " + fatorial);
		
		entra.close();
	}
}

