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
public class Exercicio22 {

    /**
     * @param args the command line arguments
     * 22.Refaça o exercício 21, lendo as taxas e as populações.
     */
    public static void main(String[] args) {
        String paisA = JOptionPane.showInputDialog("Nome do primeiro país: ");
        int populacaoPaisA = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Populacao do(a) " + paisA)); 
        float taxaCrescimentoPaisA = Float.parseFloat(JOptionPane.showInputDialog(""
                + "Taxa de crescimento do(a) " + paisA));
        String paisB = JOptionPane.showInputDialog("Nome do segundo país: ");
        int populacaoPaisB = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Populacao do(a) " + paisB)); 
        float taxaCrescimentoPaisB = Float.parseFloat(JOptionPane.showInputDialog(""
                + "Taxa de crescimento do(a) " + paisB));
        
        int anos = 0;
        
        int populacaoPaisANova = populacaoPaisA;
        int populacaoPaisBNova = populacaoPaisB;
        
        while (populacaoPaisANova < populacaoPaisBNova) {
            populacaoPaisANova += populacaoPaisANova * taxaCrescimentoPaisA / 100;
            populacaoPaisBNova += populacaoPaisBNova * taxaCrescimentoPaisB / 100;
            anos++;
        }
        
        JOptionPane.showMessageDialog(null, 
                "Após " + anos + " anos a população do(a) " +  paisA  
                + " (que era de " + populacaoPaisA + " de habitantes), \n"
                + "com taxa de crescimento de " + taxaCrescimentoPaisA + "%a.a. alcança o(a) " + paisB + " (que era de " + populacaoPaisB + "\n"
                + "e manteve taxa de crescimento anual de " + taxaCrescimentoPaisB + "%a.a.).\n"
                + "Após este período a população do(a) " + paisA + " é de " + populacaoPaisANova + " habitantes, \n"
                + "e do(a) " + paisB + " é de " + populacaoPaisBNova + ".");        
        
    }
    
}
