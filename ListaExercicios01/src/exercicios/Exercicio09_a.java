/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio09_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float raio = Float.parseFloat(
                JOptionPane.showInputDialog("Informe o raio de um círculo: "));
        JOptionPane.showMessageDialog(null,
            "***** Dados do círculo ******\n" +
            "Diâmetro = " + (2 * raio) + "\n" +
            "Circunferência = " + (2 * Math.PI * raio) + "\n" +
            "Área = " + Math.PI * Math.pow(raio, 2.0));
    }
    
}
