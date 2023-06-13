/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios03;

/**
 *
 * @author mpisching
 */
public class Exercicio18g {

    /**
     * @param args the command line arguments
     * g.Elaborar um programa que apresente no final, o somatório dos valores
     * pares existentes na faixa de 10 até 20.
     */
    public static void main(String[] args) {
        int i = 10, somatorio = 0;
        do {
            somatorio += i;
            i+=2;
        } while (i <= 20);
        System.out.println("Soma dos pares entre 10 e 20 = " + somatorio);        
    }
    
}
