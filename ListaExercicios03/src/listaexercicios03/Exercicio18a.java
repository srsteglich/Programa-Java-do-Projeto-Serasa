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
public class Exercicio18a {

    /**
     * @param args the command line arguments
     * 18.Utilizando a estrutura de repetição do...while desenvolva os seguintes programas:
     * a.Apresentar todos os valores numéricos inteiros pares situados na faixa
     * de 100 a 200.
     */
    public static void main(String[] args) {
        int i = 100;
        System.out.println("Números pares entre 100 e 200: ");
        do {
            System.out.println(i+=2);
        } while (i < 200);
    }
    
}
