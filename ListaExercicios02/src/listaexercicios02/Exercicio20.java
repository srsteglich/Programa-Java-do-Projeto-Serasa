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
public class Exercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Informe sua nota: "));
        String resultado = "Conceito equivalente a nota " + nota + " = ";
        if (nota >= 0 && nota < 3) {
            resultado += "E";
        } else if (nota <= 5) {
            resultado += "D";
        } else if (nota <= 7) {
            resultado += "C";
        } else if (nota <= 9) {
            resultado += "B";
        } else if (nota <= 10) {
            resultado += "A";
        } else {
            resultado = "A nota " + nota + " é inválida. Impossível realizar a conversão.";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
