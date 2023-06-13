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
public class Exercicio17h {

    /**
     * @param args the command line arguments
     * h.Elaborar um programa que apresente no final o somatório dos valores 
     * pares existentes na faixa de 1 até 500.
     */
    public static void main(String[] args) {
        int i = 2, somatorio = 0;
        while (i <= 500) {
            somatorio += i;
            i+=2;
        }
        System.out.println("Soma dos pares entre 1 e 500 = " + somatorio);
    }
    
}
