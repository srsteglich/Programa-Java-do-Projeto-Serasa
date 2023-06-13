package atividade;

import java.util.Scanner;

public class Aula7FORSomaNum {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int somaNum = 0;		
		
		for(int i=1;i<=4;i++) {
			System.out.println("  Digite um número: ");
			int num = entrada.nextInt();
			if (num % 2 == 0) {
				System.out.println("Resto do " + num + " então é PAR.");
			}else {
				System.out.println("Resto do " + num + " então é IMPAR.");
			}
			somaNum += num;
		}
		System.out.println(" --------------------------------- ");
		System.out.printf("  Soma dos números é: %d%n",somaNum);
		
		entrada.close();
		
	}		
}
