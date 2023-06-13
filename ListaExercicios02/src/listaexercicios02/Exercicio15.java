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
public class Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe dois valores inteiros:");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int resto = n1 % n2;
        switch (resto) {
            case 1: System.out.println("n1 + n2 + resto = " + (n1 + n2 + resto));break;
            case 2: 
                if (n1 % 2 == 0) System.out.println("n1 eh par!");
                else System.out.println("n1 eh impar!");
                if (n2 % 2 == 0) System.out.println("n2 eh par!");
                else System.out.println("n2 eh impar!");
                break;
            case 3:
                System.out.println("(n1 + n2) * n1 = " + (n1 + n2) * n1);
                break;
            case 4: 
                System.out.println("(n1 + n2) / n2 = " + (n1 + n2) / n2);
                break;
            default:
                System.out.println("n1 ao quadrado = " + n1 * n1);
                System.out.println("n2 ao quadrado = " + n2 * n2);
        }
    }
    
}
