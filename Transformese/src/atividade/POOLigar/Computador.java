package atividade.POOLigar;
public class Computador {
	boolean ligado;	
	int conta = 0;
	void ligar() {
		ligado = true; 	}	
	void desligar() {
		ligado = false; }	
	void imprimir() {  conta ++;
		if (ligado == true) { System.out.println(" A "+conta+"ª tentativa, o Computador está ligado\n" );
		} else { System.out.println(" A "+conta+"ª tentativa, o Computador está desligado\n" ); } } }
