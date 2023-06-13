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
public class Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o valor de x: "));
        int y = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o valor de y: "));
        int z = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o valor de z: "));
        
        int maior = 0;
        if (x > y && x > z) 
            maior = x;
        else if (y > z)
            maior = y;
        else 
            maior = z;
        
        int menor = (x < y ? (x < z ? x : z) : y);
        
        JOptionPane.showMessageDialog(null,
            "Para x = " + x + ", y = " + y + " e z = " + z + " \n" +
            "a soma é = " + (x + y + z) + "\n" +
            "a média é = " + ((x + y + z) / 3) + "\n" +
            "o produto é = " + (x * y * z) + "\n" +
            "o maior valor é = " + maior + "\n" +
            "o menor valor é = " + menor);
    }
    
}
