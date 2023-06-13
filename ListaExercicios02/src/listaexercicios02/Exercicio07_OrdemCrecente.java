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
public class Exercicio07_OrdemCrecente {

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
        * Explicação para esta solução: https://sites.google.com/a/liesenberg.biz/cjogos/home/materiais-de-apoio/topicos-relativos-a-c/estruturas-basicas-de-controle/ordenar-tres-valores-inteiros
        * 
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 3 números inteiros.");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        
        if (a < b) { 
            if (b < c) {
                System.out.println("Ordem: " + a + ", " + b + ", " + c);
            } else if (a < c) {
                System.out.println("Ordem: " + a + ", " + c + ", " + b);
            } else {
                System.out.println("Ordem: " + c + ", " + a + ", " + b);
            }
        } else {
            if (b < c) {
                if (a < c) {
                    System.out.println("Ordem: " + b + ", " + a + ", " + c);
                } else {
                    System.out.println("Ordem: " + b + ", " + c + ", " + a);
                }
            } else {
                System.out.println("Ordem: " + c + ", " + b + ", " + a);
            }
        }
    }    
}
