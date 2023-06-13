/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author mpisching
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Numero" + "\tQuadrado" + "\tCubo");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + "\t" + (i * i) + "\t\t" + (i * i * i) + "\n");
        }
    }
    
}
