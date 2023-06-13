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
public class Exercicio03 {

    /**
     * @param args the command line arguments
     * 3.Escreva um programa para solicitar ao usuário o raio de uma esfera 
     * (do tipo double) e chamar o método volumeDaEsfera para que calcule o 
     * volume dessa esfera utilizando a atribuição

        volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

     */
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.print("Informe o valor do raio de uma esfera: ");
        double raio = entrada.nextDouble();
        
        double volume = calcularVolume(raio);
        
        System.out.println("Volume da esfera = " + volume);
    }
    
    public static double calcularVolume(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
    
}
