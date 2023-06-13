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
public class Exercicio19e {

    /**
     * @param args the command line arguments
     * e)Apresentar todos os números divisíveis por 5 que sejam menores que 15.
     */
    public static void main(String[] args) {
        int n = 1;
        System.out.println("Números < 15 que são divisíveis por 5:");
        while (n < 15) {
            if (n % 5 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
    
}
