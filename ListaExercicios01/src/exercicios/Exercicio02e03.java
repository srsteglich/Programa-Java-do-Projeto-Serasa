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
public class Exercicio02e03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //letra b
        int x, y, z, resultado;
        //letra c
        String xVal, yVal, zVal;
        //letra d
        xVal = JOptionPane.showInputDialog("Informe o primeiro valor inteiro: ");
        //letra e
        yVal = JOptionPane.showInputDialog("Informe o segundo valor inteiro: ");
        //letra f
        zVal = JOptionPane.showInputDialog("Informe o terceiro valor inteiro: ");
        //letra g
        x = Integer.parseInt(xVal);
        //letra h
        y = Integer.parseInt(yVal);
        //letra i
        z = Integer.parseInt(zVal);
        //letra j
        resultado = x * y * z;
        //letra k
        JOptionPane.showMessageDialog(null, "O produto é: " + resultado);
        //letra l
        System.exit(0);
    }
    
}
