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
public class Exercicio04 {

    /**
     * @param args the command line arguments
     * 4.Resolva a questão anterior usando o operador condicional ternário.
     */
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, maior, menor;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Valor 4: "));
        n5 = Integer.parseInt(JOptionPane.showInputDialog("Valor 5: "));
        
        maior = (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) ? n1 : 
                (n2 > n3 && n2 > n4 && n2 > n5) ? n2 : 
                (n3 > n4 && n3 > n5) ? n3 : 
                (n4 > n5) ? n4 : n5;
        menor = (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) ? n1 : (n2 < n3 && n2 < n4 && n2 < n5) ? n2 : (n3 < n4 && n3 < n5) ? n3 : (n4 < n5) ? n4 : n5;

        JOptionPane.showMessageDialog(null, "O maior valor informado é " + maior + "\n" +
                "O menor valor informado é " + menor);

    }
    
}
