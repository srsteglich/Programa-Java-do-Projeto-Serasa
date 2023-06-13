/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios03;

import java.util.Scanner;

/**
 *
 * @author mpisching
 * 24.Escreva um programa para calcular os n primeiros termos de uma progressão 
 * aritmética (P.A.) de elemento inicial i e razão r.
 */
public class Exercicio24_PA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculo dos n primeiros termos de uma P.A.");
        System.out.print("Elemento inicial: ");
        int elementoInicial = entrada.nextInt();
        System.out.print("Razão: ");
        int razao = entrada.nextInt();
        System.out.print("Quantidade de termos: ");
        int termos = entrada.nextInt();
        System.out.print("Elementos da P.A.: ");
        int elemento = elementoInicial;
        for (int i = 1; i <= termos; i++) {
            System.out.print(elemento + " ");
            elemento += razao;
        }
        System.out.println("");
    }
    
}
