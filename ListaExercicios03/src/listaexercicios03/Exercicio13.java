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
public class Exercicio13 {

    /**
     * @param args the command line arguments
     * 13.Escreva um aplicativo que localiza o menor de vários inteiros. 
     * Assuma que o primeiro valor lido especifica o número de valores a serem 
     * digitados pelo usuário.
     */
    public static void main(String[] args) {
        int n, menor = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe um valor inteiro: "));
        menor = n--;
        while (n > 0) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe um valor inteiro: "));
            if (valor < menor) {
                menor = valor;
            }
            n--;
        }
        JOptionPane.showMessageDialog(null, "O menor valor informado foi " + menor);
    }
    
}
