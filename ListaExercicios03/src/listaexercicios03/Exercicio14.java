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
public class Exercicio14 {

    /**
     * @param args the command line arguments
     * 14.Escreva um programa que calcula o produto dos inteiros ímpares 
     * de 1 a 15 e então exibe os resultados em um diálogo de mensagem.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int produto = 1, i = 1;
        sb.append(i).append(" * ");
        for (i = 3; i <= 15; i+=2) {
            //calculo do produto dos ímpares
            produto *= i;
            //montando a string de resposta em StringBuilder
            sb.append(i);
            if (i < 15) sb.append(" * ");
            else sb.append(" = ").append(produto);
        }
        JOptionPane.showMessageDialog(null, sb);
    }
    
}
