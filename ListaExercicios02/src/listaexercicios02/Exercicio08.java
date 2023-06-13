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
public class Exercicio08 {

    /**
     * @param args the command line arguments
     * 8.Elaborar um programa em Java que efetue a leitura de um valor que
     * esteja entre a faixa de 1 a 9. Após a leitura do valor fornecido pelo 
     * usuário, o programa deverá indicar uma de duas mensagens:
     * “O valor está na faixa permitida”, caso o usuário forneça o valor 
     * nesta faixa, ou a mensagem “O valor está fora da faixa permitida”, 
     * caso o usuário forneça valores menores que 1 ou maiores que 9.
     */
    public static void main(String[] args) {
        int valor = Integer.parseInt(
                JOptionPane.showInputDialog("Informe um valor esteja entre a faixa de 1 a 9: "));
        if (valor >= 1 && valor <= 9) {
            JOptionPane.showMessageDialog(null, "O valor está dentro da faixa permitida.");       
        } else {
            JOptionPane.showMessageDialog(null, "O valor está fora da faixa permitida.");
        }
    }
    
}
