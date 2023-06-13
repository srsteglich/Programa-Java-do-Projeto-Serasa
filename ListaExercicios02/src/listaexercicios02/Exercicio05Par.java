
package listaexercicios02;

import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio05Par {

    /**
     * 5.Escreva um aplicativo que faça a leitura de um inteiro e identifica 
     * se ele é ímpar ou par.
     */
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
        if (n1 % 2 != 0) {
            JOptionPane.showMessageDialog(null, "O número " + n1 + " é impar!");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + n1 + " é par!");
        }
    }
    
}
