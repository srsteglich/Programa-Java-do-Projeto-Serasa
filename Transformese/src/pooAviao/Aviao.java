package pooAviao;

public class Aviao {
	
	// Atribuitos do aviao
	String fabricante = "Embraer";
	String modelo;
	int qtdeMotores;
	int passageiros;
	
	Piloto piloto;
	
	// então o aviao obritagoriamente motor
	Motor motor = new Motor();
	
	// ações do aviao
	void aceleraraviao() {
		motor.velocidadeMotor += 20;
	}
	
}
