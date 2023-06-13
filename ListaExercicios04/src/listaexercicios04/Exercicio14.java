/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

import java.text.DateFormat;

/**
 *
 * @author mpisching
 * 14. Crie um método que receba três números inteiros como parâmetros, 
 * representando horas, minutos e segundos, e os converta em segundos. 
 * Exemplo: 2h, 40min e 10s correspondem a 9.610 segundos.
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //DateFormat df = new DateFormat("hh:MM:ss");
        System.out.print("Informe um horário no formato hh:mm:ss ==> ");
        String horario = entrada.next();
        int horas = Integer.parseInt(horario.substring(0, 2));
        int minutos = Integer.parseInt(horario.substring(3, 5));
        int segundos = Integer.parseInt(horario.substring(6, 8));
        
        long horarioEmSegundos = converterHora(horas, minutos, segundos);
        
        System.out.println("O horário informado equivale a " + horarioEmSegundos + " segundos.");
    }

    private static long converterHora(int horas, int minutos, int segundos) {
        long segundosTotal = horas * 60 * 60;
        segundosTotal += minutos * 60;
        segundosTotal += segundos;
        return segundosTotal;
    }
    
}
