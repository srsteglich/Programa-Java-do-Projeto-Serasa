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
public class Exercicio17g {

    /**
     * @param args the command line arguments
     * g.Apresentar as potências de 3 variando de 0 a 15. 
     * Deve ser considerado que qualquer número elevado a zero é 1, e elevado 
     * a 1 é ele próprio. Deverá ser apresentado, observando a seguinte 
     * definição.
     */
    public static void main(String[] args) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i <= 15) {
            sb.append("3 elevado a pontência de ").append(i).append(" = ").
                    append((int)Math.pow(3, i)).append("\n");
            i++;
        }
        JOptionPane.showMessageDialog(null, sb);
    }
    
}
