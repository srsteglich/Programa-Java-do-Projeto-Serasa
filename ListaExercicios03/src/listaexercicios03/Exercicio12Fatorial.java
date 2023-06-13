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
public class Exercicio12Fatorial {

    /**
     * @param args the command line arguments
     * 12.Escreva um aplicativo que lê um inteiro não-negativo de diálogo
     * de entrada, computa e imprima seu fatorial.
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Você deseja conhecer o fatorial de qual número: "));
        if (n < 0) {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
            System.exit(0);
        }
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é " + fatorial);
    }
    
}
