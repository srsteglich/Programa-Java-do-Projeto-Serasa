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
public class Exercicio18 {

    /**
     * @param args the command line arguments
     * 18.Faça um programa que receba o valor do salário de uma pessoa e o valor 
     * de um financiamento pretendido. Caso o financiamento seja menor ou igual 
     * a 5 vezes o salário da pessoa, o algoritmo deverá escrever 
     * “Financiamento Concedido"; senão, ele deverá escrever 
     * "Financiamento Negado". Independente de conceder ou não o financiamento, 
     * o programa deve mostrar a frase "Obrigado por nos consultar."
     */
    public static void main(String[] args) {
        float salario = Float.parseFloat(JOptionPane.showInputDialog(""
                + "Salario: "));
        float valorFinanciamento = Float.parseFloat(JOptionPane.showInputDialog(""
                + "Valor do financiamento pretendido: "));
        float margemFinanciamento = salario * 5;
        String resultado = "";
        if (valorFinanciamento <= margemFinanciamento) {
            resultado += "Financiamento Concedido\n";
        } else {
            resultado += "Financiamento Negado\n";
        }
        resultado += "Obrigado por nos consultar";
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
