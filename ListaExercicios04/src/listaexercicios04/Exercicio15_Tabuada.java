/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

/**
 *
 * @author mpisching
 * 15.	Faça um método que imprima a tabuada de um valor X
 */
public class Exercicio15_Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print("Informe um número inteiro para encontrar a sua tabuada: ");
        int x = entrada.nextInt();
        imprimirTabuada(x);
        
        entrada.close();
    }

    private static void imprimirTabuada(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + x + " = " + (i * x));
        }
    }
    
}
