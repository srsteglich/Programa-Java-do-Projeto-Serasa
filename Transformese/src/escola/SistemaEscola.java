package escola;

public class SistemaEscola {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.matricula = 00001;
		aluno1.nome = "Tati";
		aluno1.sobrenome = "Martins";
		aluno1.serie = "5ª serie";
		aluno1.turma = "B";
		
		double mediaAluno = aluno1.calculaMedia(5.5, 6.7);
		
		System.out.println(" A Media foi  " +mediaAluno);
		
		
		Professor  prof1 = new Professor();
		prof1.nome = "Ariel";
		prof1.materia = "Libras";
		
	}
}
