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
public class Exercicio18b {

    /**
     * @param args the command line arguments
     * b.Apresentar o total da soma obtido dos cinco primeiros números inteiros.
     */
    public static void main(String[] args) {
        int i = 1, soma = 0;
        do {
            soma += i++;
        } while (i <= 5);
        System.out.println("Soma dos cinco primeiros inteiros: " + soma);
    }
    
}
