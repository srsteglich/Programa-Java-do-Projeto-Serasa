package atividade;

import java.util.Scanner;

public class Aula7WhileSomaNum {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int somaNum = 0;
		
		while (somaNum < 100) {
			System.out.println("  Digite um número:");
			int num = entrada.nextInt();
			//somaNum += num;
			System.out.printf("  -->  somandos %d%n ",somaNum += num);
		}
		System.out.println(" --------------------------------- ");
		System.out.printf("  Soma dos números é %d%n", somaNum);
		
		entrada.close();
	}
}
