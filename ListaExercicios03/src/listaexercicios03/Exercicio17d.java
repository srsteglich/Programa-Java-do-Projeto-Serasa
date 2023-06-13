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
public class Exercicio17d {

    /**
     * @param args the command line arguments
     * d.Ler um número N qualquer menor ou igual a 50 e apresentar o valor
     * obtido da multiplicação sucessiva de N por 3 enquanto o produto 
     * for menor que 250.
     */
    public static void main(String[] args) {
        //multiplicação sucessiva por 3 até que o produto seja maior ou igual a 250
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Informe um valor que seja <= 50"));
        int produto = n;
        if (n >= 0 && n <= 50) {
            int i = 1;
            while (produto < 250) {
                sb.append(produto).append(" * 3 = ");
                produto *= 3;
                sb.append(produto).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb);
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }
    
}
