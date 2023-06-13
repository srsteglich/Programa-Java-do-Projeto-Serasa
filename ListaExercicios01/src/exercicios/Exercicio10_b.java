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
public class Exercicio10_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imprimindo todos os caracteres da tabela ASCII
        //StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 255; i++) {
            System.out.println("Caractere \'" + (char)i + "\' = " + i);
            //sb.append("Caractere \'" + (char)i + "\' = " + i + "\n");
        }
        //JOptionPane.showMessageDialog(null, sb);
    }   
}
