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
public class Exercicio03Menor {

    /**
     * @param args the command line arguments
     * 3. Escreva um aplicativo para ler cinco inteiros e determine 
     * o maior e o menor inteiro do grupo, imprimindo os devidos 
     * resultados na tela.
     */
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, maior, menor;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Valor 4: "));
        n5 = Integer.parseInt(JOptionPane.showInputDialog("Valor 5: "));
        
        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) maior = n1;
        else if (n2 > n3 && n2 > n4 && n2 > n5) maior = n2;
        else if (n3 > n4 && n3 > n5) maior = n3;
        else if (n4 > n5) maior = n4;
        else maior = n5;
        
        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
            menor = n1;
        } else if (n2 < n3 && n2 < n4 && n2 < n5) {
            menor = n2;
        } else if (n3 < n4 && n3 < n5) {
            menor = n3;
        } else if (n4 < n5) {
            menor = n4;
        } else {
            menor = n5;
        }
        
        JOptionPane.showMessageDialog(null, "O maior valor informado é " + maior + "\n" +
                "O menor valor informado é " + menor);
    }
    
}
