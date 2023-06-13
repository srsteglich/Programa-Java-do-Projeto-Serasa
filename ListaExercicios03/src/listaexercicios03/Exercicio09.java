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
public class Exercicio09 {

    /**
     * @param args the command line arguments
     * O laço executa por 10 vezes e irá a imprimir a série:
            1
            4
            9
            16
            25
            36
            49
            64
            81
            100
            Total is 385

     * Que corresponde a soma dos quadrados de 1 a 10
     *  
     */
    public static void main(String[] args) {
        int y, x = 1, total = 0;
        while (x <= 10) {
            y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }
        System.out.println("Total is " + total);
    } 
}
