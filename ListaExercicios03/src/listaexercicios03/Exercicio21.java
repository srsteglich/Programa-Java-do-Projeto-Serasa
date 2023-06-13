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
public class Exercicio21 {

    /**
     * @param args the command line arguments
     * 21.Supondo que a população de um país A seja da ordem de 90.000.000
     * habitantes com uma taxa anual de crescimento de 3% e que a população
     * de um país B seja aproximadamente de 200.000.000 habitantes com uma
     * taxa anual de crescimento de 1,5%. Fazer um programa que calcule e
     * escreva o número de anos necessários para que a população do país A 
     * ultrapasse ou iguale a população do país B, mantidas essas taxas de 
     * crescimento.
     */
    public static void main(String[] args) {
        int populacaoPaisA = 90000000;
        int populacaoPaisB = 200000000;
        
        int anos = 0;
        
        while (populacaoPaisA < populacaoPaisB) {
            populacaoPaisA += populacaoPaisA * 0.03;
            populacaoPaisB += populacaoPaisB * 0.015;
            anos++;
        }
        
        JOptionPane.showMessageDialog(null, 
                "Após " + anos + " anos a população do país A (que era de 90000000 de habitantes), \n"
                        + "com taxa de crescimento de 3%a.a. alcançou o país B (que era de 200000000\n"
                        + "e manteve taxa de crescimento anual de 1,5%a.a.).\n"
                        + "Após este período a população do país A é de " + populacaoPaisA + " habitantes, \n"
                        + "e do país B é de " + populacaoPaisB + ".");
    }
    
}
