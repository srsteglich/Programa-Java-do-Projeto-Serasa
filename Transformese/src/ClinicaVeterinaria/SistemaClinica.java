package ClinicaVeterinaria;

public class SistemaClinica {

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro();
		Cachorro cao2 = new Cachorro();
		
		cao1.id = 000001;
		cao1.nome = "Sidu";
		cao1.dono = "Sérgio Renato";
		cao1.raca = "Lhasa Apso";
		cao1.sexo = "M";
		cao1.idade = 8;
				
		cao2.id = 000002;
		cao2.nome = "Mey";
		cao2.dono = "Anelise";
		cao2.raca = "Shih-tzu";
		cao2.sexo = "F";
		cao2.idade = 2;
		
		double gasto = cao1.gastos(80, 120); 
		
		System.out.println(" O Cachorro "+cao1.nome+ " Raça "+cao1.raca+" e o dono é "+cao1.dono);
		System.out.printf(" Total à pagar R$ %.2f ",gasto);
		
	}
}
