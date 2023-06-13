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
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 2, y = 3;
        //letra a
        JOptionPane.showMessageDialog(null, "x = " + x);
        //letra b
        JOptionPane.showMessageDialog(null, "O valor de x + x é " + ( x + x ));
        //letra c
        JOptionPane.showMessageDialog( null, "x = ");
        //letra d
        JOptionPane.showMessageDialog(null, ( x + y ) + " = " + ( y + x ));
    }
    
}
