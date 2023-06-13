package atividade;

import java.util.Arrays;
import java.util.Scanner;

public class Aula17Array {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int conta = 1;
		double[] notas = new double[4];
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println(" Digite a "+ conta +"ª notas e o indice "+ i);
			notas[i] = entrada.nextDouble();
			conta++;
		}
		
		System.out.println(" As notas são: " + Arrays.toString(notas));
		entrada.close();
	}
}
