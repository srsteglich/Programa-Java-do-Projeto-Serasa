/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author mpisching
 */
public class Exercicio10_c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char ch = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            try {
                ch = entrada.nextLine().charAt(0);
                // a instrução anterior é equivalente as linhas comentadas a seguir
                //String str = entrada.nextLine();
                //ch = str.charAt(0);
                System.out.println("Caractere \'" + ch + "\' = " + (int)ch);
            } catch (java.lang.StringIndexOutOfBoundsException ex) {
                ch = 13;
                System.out.println("Fim...");
            }
        } while (ch != 13);
    }   
}
