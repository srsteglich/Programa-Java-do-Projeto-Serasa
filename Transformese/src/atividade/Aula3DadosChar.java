package atividade;

import java.util.Scanner;

public class Aula3DadosChar {
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);	
		
		System.out.println("Digite o teu 1º Nome: ");
		String nome = entra.nextLine();
		System.out.println("Digite o teu Sobrenome: ");
		String sobre = entra.nextLine();
		System.out.println("Digite o teu time de coração: ");
		String time = entra.nextLine();
		System.out.println("_____________________________________");
		System.out.println("Meu nome é " + nome);
		System.out.println("Meu sobrenome é " + sobre);
		System.out.println("Meu nome completo é " + nome + " " +sobre);
		System.out.println("Meu time favorito é " + time);		
		
		
		entra.close();

	}
}
