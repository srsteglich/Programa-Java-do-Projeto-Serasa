package atividade;

import java.util.Scanner;

public class Aula3Par {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		System.out.println("Digite o 1º número ");
		int num1 = entra.nextInt();
		System.out.println("Digite o 2º número ");
		int num2 = entra.nextInt();		
		
		float soma = num1 + num2;
		float subt = num1 - num2;
		float mult = num1 * num2;
		float divi = num1 / num2;
		float res1 = num1 % 2;
		float res2 = num2 % 2;
		
		System.out.println("-----------------------------------");
		System.out.println("        Calculadora ");
		System.out.println("-----------------------------------");
		System.out.printf("Somar: " + num1 + " + " + num2 + " = " + soma + "\n");
		System.out.printf("Subtrair: " + num1 + " - " + num2 + " = " + subt + "\n");
		System.out.printf("Multiplicar: " + num1 + " * " + num2 + " = " + mult + "\n");
		System.out.printf("Dividir: " + num1 + " / " + num2 + " = " + divi + "\n");		
		System.out.println("Resto do " + num1 + " é " + res1);
		System.out.println("Resto do " + num2 + " é " + res2);		
		System.out.println("-----------------------------------");
		System.out.println("        D E S A F I O ");
		System.out.println("-----------------------------------");
		if (num1 % 2 == 0) {
			System.out.println("Resto do Nº1: " + num1 + " então é PAR.");
		}else {
			System.out.println("Resto do Nº1: " + num1 + " então é IMPAR.");
		}
		if (num2 %2 == 0) {
			System.out.println("Resto do Nº2: " + num2 + " então é PAR.");			
		}else {
			System.out.println("Resto do Nº2: " + num2 + " então é IMPAR.");			
		}
		
		entra.close();

	}

}

