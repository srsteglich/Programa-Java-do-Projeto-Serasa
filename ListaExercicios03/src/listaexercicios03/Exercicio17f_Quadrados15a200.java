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
public class Exercicio17f_Quadrados15a200 {

    /**
     * @param args the command line arguments
     * f.Apresentar os quadrados dos números inteiros de 15 a 200.
     */
    public static void main(String[] args) {
        int i = 15;
        StringBuilder sb = new StringBuilder();
        while (i <= 200) {
            sb.append("Quadrado de ").append(i).append(" = ").append((int)Math.pow(i,2)).append("\n");
            i++;
        }
        System.out.println(sb);
    }
    
}
