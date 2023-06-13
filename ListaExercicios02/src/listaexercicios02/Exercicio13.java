/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios02;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     * 13.Escrever um programa para ler cinco valores inteiros, 
     * calcular a sua média, e escrever na tela os números que são 
     * superiores à média.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        
        System.out.println("Informe 5 valores inteiros: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        n4 = entrada.nextInt();
        n5 = entrada.nextInt();
        
        float media = (n1 + n2 + n3 + n4 + n5) / 5.0f;
        System.out.println("A media dos números é " + media + " e os valores a seguir estão acima da média: ");
        if (n1 > media) System.out.println(n1);
        if (n2 > media) System.out.println(n2);
        if (n3 > media) System.out.println(n3);
        if (n4 > media) System.out.println(n4);
        if (n5 > media) System.out.println(n5);
    }
}
