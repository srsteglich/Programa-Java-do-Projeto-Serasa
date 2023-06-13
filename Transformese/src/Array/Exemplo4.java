package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Quantas notas serão?");
		int quant = entrada.nextInt();
		
		double[] notas = new double[quant];
		for (int i = 0; i < quant; i++) {
			System.out.printf(" Informe a nota %d do aluno\n", i + 1);
			notas[i] = entrada.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		
		entrada.close();
	}
}
