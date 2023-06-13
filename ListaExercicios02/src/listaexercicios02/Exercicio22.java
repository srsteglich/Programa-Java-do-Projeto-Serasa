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
public class Exercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Informe a idade: ");
        int idade = Integer.parseInt(str);
        String categoria = "";
        
        if (idade < 5) {
            categoria = "Individuos com idade inferior a 5 anos não são aceitos";
        } else if (idade <= 7) {
            categoria = "Infantil A";
        } else if (idade <= 11) {
            categoria = "Infantil B";
        } else if (idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade <= 17) {
            categoria = "Juvenil B";
        } else {
            categoria = "Adulto";
        }
        
        JOptionPane.showMessageDialog(null, "Idade = " + idade + 
                "\nCategoria = " + categoria, "Categoria para natação", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
