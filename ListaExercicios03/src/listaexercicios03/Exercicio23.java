/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios03;

import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 * 23.Um determinado material radioativo perde metade de sua massa a cada 
 * 50 segundos. Dada a massa inicial, em gramas, fazer um programa que 
 * determine o tempo necessário para que essa massa se torne menor que 
 * 0,5 grama. Escreva a massa inicial, a massa final e o tempo calculado em 
 * horas, minutos e segundos.
 */
public class Exercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double massaInicial = Float.parseFloat(JOptionPane.showInputDialog(""
                + "Informe a massa inicial (em gramas) do material radiativo:"));
        double massaFinal = massaInicial;
        int tempo = 0;
        
        while (massaFinal >= 0.5f) {
            massaFinal /= 2;
            tempo += 50;
        }
        
        int segundos = tempo % 60;
        tempo /= 60;
        int minutos = tempo % 60;
        tempo /=60;
        int horas = tempo % 24;
        
        JOptionPane.showMessageDialog(null, ""
                + "Massa inicial: " + massaInicial + "\n"
                + "Massa final: " + massaFinal + "\n"
                + "Tempo: " + horas + ":" + minutos + ":" + segundos);
    }
    
}
