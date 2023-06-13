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
public class Exercicio19b {

    /**
     * @param args the command line arguments
     * b)Apresentar o total da soma obtido de N números inteiros.
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Informe o valor de N: "));
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        JOptionPane.showMessageDialog(null, "A soma dos " + n + " inteiros = " + soma);
    }
    
}
