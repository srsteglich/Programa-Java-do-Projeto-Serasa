package escola;

public class Aluno {

	int matricula;
	String nome;
	String sobrenome;
	String serie;
	String turma;
	
	// método 
/*	void calculaMedia() {
		System.out.println(" o metodo foi chamado ");
	}  */
	
	double calculaMedia(double not1, double not2) {
		double soma = not1 + not2;
		return soma/2;
	}
	
}
