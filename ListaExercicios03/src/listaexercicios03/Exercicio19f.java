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
public class Exercicio19f {

    /**
     * @param args the command line arguments
     * f)Apresentar as potências de 2, variando de 0 a 10.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            sb.append("2 elevado a pontência de ").append(i).append(" = ").
                    append((int)Math.pow(2, i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb);
    }
    
}
