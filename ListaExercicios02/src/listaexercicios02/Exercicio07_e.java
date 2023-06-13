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
public class Exercicio07_e {

    /**
     * @param args the command line arguments
     * e.Efetuar a leitura de quatro número inteiros e apresentar os 
     * números que são divisíveis por 2 e 3.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 4 numeros inteiros.");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();
        
        if (n1 % 2 == 0 && n1 % 3 == 0) {
            System.out.println("O valor " + n1 + " e divisivel por 2 e 3");
        } 
        
        if (n2 % 2 == 0 && n2 % 3 == 0) {
            System.out.println("O valor " + n2 + " e divisivel por 2 e 3");
        } 
        
        if (n3 % 2 == 0 && n3 % 3 == 0) {
            System.out.println("O valor " + n3 + " e divisivel por 2 e 3");
        } 
        
        if (n4 % 2 == 0 && n4 % 3 == 0) {
            System.out.println("O valor " + n4 + " e divisivel por 2 e 3");
        } 

    }
    
}
