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
public class Exercicio15 {

    /**
     * @param args the command line arguments
     * 15.Faça um programa que determine o maior entre N números. 
     * A condição de parada é a entrada de um valor 0, ou seja, o programa deve 
     * ficar calculando o maior até que a entrada seja igual a 0 (ZERO).
     */
    public static void main(String[] args) {
        int maior = 0, valor, i = 0;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe um valor inteiro: "));
            if (i == 0) maior = valor;
            else {
                if (valor > maior) {
                    maior = valor;
                }
            }
            i++;
        } while (valor != 0 ); 
        JOptionPane.showMessageDialog(null, 
            "O maior valor informado foi " + maior);
    }
    
}
