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
public class Exercicio19g {

    /**
     * @param args the command line arguments
     * g)Elaborar um programa que apresente o valor de uma potência de uma base elevada a um expoente qualquer, ou seja, de NM.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int base = Integer.parseInt(JOptionPane.showInputDialog(""
                + "base: ", "Calculo da potência de um número"));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog(""
                + "expoente: "));
        for (int i = 0; i <= expoente; i++) {
            sb.append(base).append(" elevado ao expoente ").append(i).append(" = ").
                    append((int)Math.pow(base, i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb);        
    }
    
}
