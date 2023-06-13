package Aula17Composicao;

public class SistemaPlaca {

	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		car1.placa = new Placa();
		
		System.out.println(" O nº da Placa é " + car1.placa.dadosPlaca);

	}
}
