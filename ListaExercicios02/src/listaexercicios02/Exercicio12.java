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
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte codigo = Byte.parseByte(JOptionPane.showInputDialog(""
                + "Informe o código do produto."));
        switch (codigo) {
            case 1: JOptionPane.showMessageDialog(null, "Alimento não perecível."); break;
            case 2: 
            case 3:
            case 4: JOptionPane.showMessageDialog(null, "Alimento perecível."); break;
            case 5: 
            case 6: JOptionPane.showMessageDialog(null, "Vestuário."); break;
            case 7: JOptionPane.showMessageDialog(null, "Higiene pessoal."); break;
            case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15:
                JOptionPane.showMessageDialog(null, "Limpeza e utensílios domésticos."); break;
            default: 
                JOptionPane.showMessageDialog(null, "Código inválido."); break;
        }
    }
    
}
