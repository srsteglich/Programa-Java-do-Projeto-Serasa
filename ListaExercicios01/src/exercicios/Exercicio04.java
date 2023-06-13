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
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite dois números");
        int b = Integer.parseInt(
                    JOptionPane.showInputDialog("Primeiro número: "));
        int c = Integer.parseInt(
                    JOptionPane.showInputDialog("Segundo número: "));
        
        int a = b * c;
        
        JOptionPane.showMessageDialog(null, "o produto de " + b + " com " + c +
                        " é igual a " + a);
    }
    
}
