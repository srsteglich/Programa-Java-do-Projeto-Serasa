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
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));

        JOptionPane.showMessageDialog(null,
                x + " + " + y + " = " + (x + y) + "\n" +
                x + " * " + y + " = " + (x * y) + "\n" +
                x + " - " + y + " = " + (x - y) + "\n" +
                x + " / " + y + " = " + (x / y));
        
        
        
        
    }
    
}
