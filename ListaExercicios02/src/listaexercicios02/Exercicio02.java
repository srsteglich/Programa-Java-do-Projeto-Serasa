/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios02;

import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     * 2. Escreva um aplicativo para solicitar ao usuário a digitação de 
     * dois números inteiros, que obtém os números do usuário e exibe 
     * o maior entre eles seguido pelas palavras “é maior” em um 
     * diálogo de mensagem de informação. 
     * Se os números forem iguais, ele imprime a mensagem 
     * “os números são iguais!”. 
     */
    public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
        
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O primeiro valor é maior");
        } else if (n2 > n1) {
            JOptionPane.showMessageDialog(null, "O segundo valor é maior");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais!");
        }
    }
    
}
