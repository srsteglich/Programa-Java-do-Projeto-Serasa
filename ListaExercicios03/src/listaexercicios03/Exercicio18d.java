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
public class Exercicio18d {

    /**
     * @param args the command line arguments
     * d.Apresentar todos os números divisíveis por 4 que sejam menores que 20.
     */
    public static void main(String[] args) {
        int n = 1;
   
        System.out.println("Números < 20 que são divisíveis por 4:");
        do  {
            if (n % 4 == 0) {
                System.out.println(n);
            }
            n++;
        } while (n <= 20);       
    }
    
}
