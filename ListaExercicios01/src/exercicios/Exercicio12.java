/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     * teste de javadoc
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        String sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome");
        JOptionPane.showMessageDialog(null, 
                "Seu nome completo é " + nome + " " + sobrenome);
    }
    
    /**
     * Este método ..... blbllblbl
     * @param a inteiro a asdfasflkasflkasf
     * @param b inteiro b asdlfkasçfkas
     * @return int asdfasfsfa 
     * asfasdf d
     */
    public static int teste(int a, int b) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        return a + b + c;
    }
    
}
