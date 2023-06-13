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
public class Exercicio09 {

    /**
     * @param args the command line arguments
     * 9.Elaborar um programa que efetue a leitura do nome e do sexo de 
     * uma pessoa, apresentando como saída uma das seguintes mensagens: 
     * “Ilmo Sr.”, para o sexo informado como masculino, ou a mensagem 
     * “Ilma Sra.”, para o sexo informado como feminino. 
     * Apresente na sequência da mensagem impressa o nome da pessoa.
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome: ");
        String sexo = JOptionPane.showInputDialog("Sexo (M/F)?" );
        if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino")) {
            JOptionPane.showMessageDialog(null, "Ilmo Sr. " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "Ilma Sra. " + nome);
        }
    }
    
}
