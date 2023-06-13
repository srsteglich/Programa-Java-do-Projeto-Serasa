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
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     * 4.Escreva um programa para ler cinco números inteiros e determina e 
     * imprime quantos números são negativos, quantos positivos e quantos 
     * zeros foram lidos.
     */
    public static void main(String[] args) {
        int negativos = 0, positivos = 0, zeros = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Informe o valor " + i + ": "));
            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else zeros++;
        }
        
        JOptionPane.showMessageDialog(null, "Dos números informados, \n" +
                "Positivo(s): " + positivos + "\n" +
                "Negativo(s): " + negativos + "\n" +
                "Zero(s): " + zeros);
        
    }
    
}
