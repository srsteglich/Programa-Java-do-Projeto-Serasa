package atividade.POOLigar;
public class SistemaLigar {
	public static void main(String[] args) {
		Computador cpu = new Computador();
		cpu.ligado = true;
		cpu.imprimir();
		cpu.desligar();
		cpu.imprimir();
		cpu.ligar();
		cpu.imprimir(); } }
