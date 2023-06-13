/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     * 10.Escreve um programa que insere inteiros e os passa um por vez para o
     * método ePar, que utiliza o operador de módulo para determinar se um 
     * inteiro é par. O método deve receber um argumento de inteiro e retornar
     * true se o inteiro for par e false caso contrário.
     */
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Informe um valor inteiro: "));
        if (ePar(num)) {
            JOptionPane.showMessageDialog(null, "É par.");
        } else {
            JOptionPane.showMessageDialog(null, "É impar.");
        }
    }
    
    public static boolean ePar(int valor) {
        return valor % 2 == 0;
    }
    
}
