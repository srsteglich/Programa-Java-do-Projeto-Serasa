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
public class Exercicio17c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Você deseja a tabuada de qual número? "));
        
        StringBuilder sb = new StringBuilder();
        sb.append("Esta é tabuada de ").append(n).append("\n");
        int i = 1;
        while (i <= 10) {
            sb.append(i).append(" * ").append(n).append(" = ").append(i * n).append("\n");
            i++;
        }
        
        JOptionPane.showMessageDialog(null, sb);
    }
    
}
