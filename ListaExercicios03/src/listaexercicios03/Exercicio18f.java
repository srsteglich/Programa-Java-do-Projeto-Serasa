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
public class Exercicio18f {

    /**
     * @param args the command line arguments
     * f.Apresentar as potências de 2 variando de 0 a 10.
     */
    public static void main(String[] args) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append("2 elevado a pontência de ").append(i).append(" = ").
                    append((int)Math.pow(2, i)).append("\n");
            i++;
        } while (i <= 10);
        JOptionPane.showMessageDialog(null, sb);
    }
    
}
