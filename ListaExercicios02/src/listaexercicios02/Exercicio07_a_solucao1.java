/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios02;

import java.util.Scanner;

/**
 *
 * @author mpisching
 */
public class Exercicio07_a_solucao1 {

    /**
     * @param args the command line arguments
     * a.Efetuar a leitura de três valores (variáveis A, B e C) e apresentar 
     * os valores dispostos em ordem crescente.
     */
    public static void main(String[] args) {
        /**
        * situacoes possiveis
        * a b c
        * a c b
        * b a c
        * b c a
        * c a b
        * c b a
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 3 números inteiros.");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        
        if (a < b && b < c) {
            System.out.println("Ordem: " + a + ", " + b + ", " + c);
        } else if (a < c && c < b) {
            System.out.println("Ordem: " + a + ", " + c + ", " + b);
        } else if (b < a && a < c){
            System.out.println("Ordem: " + b + ", " + a + ", " + c);
        } else if (b < c && c < a) {
            System.out.println("Ordem: " + b + ", " + c + ", " + a);
        } else if (c < a && a < b) {
            System.out.println("Ordem: " + c + ", " + a + ", " + b);
        } else {
            System.out.println("Ordem: " + c + ", " + b + ", " + a);
        }
    }
    
}
