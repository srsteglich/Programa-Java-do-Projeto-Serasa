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
public class Exercicio17b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long soma = 0;
        int i = 1;
        while (i <= 100) {
            soma += i++;
        }
        System.out.println("A soma dos inteiros entre 1 e 100 = " + soma);
    }
    
}
