/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

/**
 *
 * @author mpisching
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.println("Informe o valor de A: ");
        float a = entrada.nextFloat();
        System.out.println("Informe o valor de B: ");
        float b = entrada.nextFloat();
        System.out.println("Informe o valor de C: ");
        float c = entrada.nextFloat();
        
        System.out.println("O menor valor é: " + menor3(a, b, c));
    }
    
    public static float menor3(float a, float b, float c) {
        return Math.min(a, Math.min(b, c));
    }
    
}
