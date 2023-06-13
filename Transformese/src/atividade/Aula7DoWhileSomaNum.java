package atividade;

import java.util.Scanner;

public class Aula7DoWhileSomaNum {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int digitaProximo;
		int somaTot = 0;
		
		do {
			System.out.println("  Digite um número ");
			int num = entrada.nextInt();
			somaTot += num;
			 
			System.out.println("  Deseja digitar outro número? \n  [1]-Sim  [2]-Não: ");
			digitaProximo =entrada.nextInt();
		} while (digitaProximo != 2);
		System.out.println(" --------------------------------------------- ");		
		System.out.printf("  A soma dos números digitados foi de: %d",somaTot);
		entrada.close();
	}
}
