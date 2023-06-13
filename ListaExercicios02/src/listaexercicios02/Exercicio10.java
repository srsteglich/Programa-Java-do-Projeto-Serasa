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
public class Exercicio10 {

    /**
     * @param args the command line arguments
     * 10.Tendo como dados de entrada a
     * altura e o sexo de uma pessoa, construa um programa que calcule peso
     * ideal, utilizando as seguintes fórmulas: Para homens: (72.7*h) – 58 Para
     * mulheres: (62.1*h) – 44.7 Onde h equivale a altura da pessoa.
     */
    public static void main(String[] args) {
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua altura: "));
        String sexo = JOptionPane.showInputDialog("Sexo (M/F)? ");
        float pesoIdeal = 0.0f;
        if (sexo.equalsIgnoreCase("m")) {
            pesoIdeal = (72.7f * altura) - 58f;
        } else {
            pesoIdeal = (62.1f * altura) - 44.7f;
        }
        
        JOptionPane.showMessageDialog(null, "Seu peso ideal é " + pesoIdeal);
        
    }
    
}
