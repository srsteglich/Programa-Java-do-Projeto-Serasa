package pooAviao;

public class testeAviao {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		System.out.println(" Modelo: "+aviao.fabricante);
		System.out.println(aviao.motor.velocidadeMotor);
		
		aviao.aceleraraviao();
		aviao.aceleraraviao();
		
		System.out.println(aviao.motor.velocidadeMotor);
		Piloto piloto = new Piloto();
		
	}

}
