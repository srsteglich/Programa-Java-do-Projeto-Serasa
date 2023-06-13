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
public class Exercicio19a {

    /**
     * @param args the command line arguments
     * a)Apresentar todos os valores numéricos inteiros ímpares situados na 
     * faixa de 1000 a 1500
     */
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1000 e 1500");
        for (int i = 1001; i < 1500; i+=2) {
            System.out.println(i);
        }
    }
    
}
