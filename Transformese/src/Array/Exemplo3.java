package Array;

import java.util.Arrays;

public class Exemplo3 {

	public static void main(String[] args) {
		int[] idades = new int[4];
		
		idades[0] = 18;
		idades[2] = 25;
	
		System.out.println(idades);		
		
		System.out.println(Arrays.toString(idades));
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Seq "+ i + ", o Valor Array " + idades[i]);
		}		
		
		for (int idade: idades) {
			System.out.println("Com Foreach  "+ idade);
		}
	}

}
