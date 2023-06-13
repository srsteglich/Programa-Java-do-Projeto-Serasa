/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

/**
 *
 * @author mpisching
 * 9.Escreva um método potenciaInteiro(base,expoente) que retorna o valor de 

    base^expoente

    Por exemplo potenciaInteiro(3,4) = 3 * 3 * 3 * 3.
    Pressuponha que expoente é um inteiro diferente de zero positivo e base 
    é um inteiro. O método potenciaInteiro deve utilizar for ou while para 
    controlar o cálculo. Não utilize nenhum método da biblioteca de matemática.

 */
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Informe a base: ");
        int base = entrada.nextInt();
        System.out.println("Informe o expoente: ");
        int expoente = entrada.nextInt();
        System.out.println(base + " ^ " + expoente + " = " + potenciaInteiro(base, expoente));
    }
    
    public static int potenciaInteiro(int base, int expoente) {
        int total = 1;
        //for (int i = 0; i < expoente; i++) {
        //    total *= base;
        //}
        int i = 0;
        while (i < expoente) {
            total *= base;
            i++;
        }
        return total;
    }
    
}
