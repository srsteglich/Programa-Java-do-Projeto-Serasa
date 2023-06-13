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
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 1, soma = 0;
        while (i <= 10) {
            soma += i++;
        }
        
        System.out.println("A soma dos inteiros de 1 a 10 eh " + soma);
    }
    
}
