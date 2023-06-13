/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios03;

/**
 *
 * @author mpisching
 */
public class Exercicio17a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 0 e 20: ");
        int i = 0;
        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("");
    }
    
}
