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
public class Exercicio19h {

    /**
     * @param args the command line 
     * h)Elaborar um programa que apresente no final, o somatório dos valores 
     * pares existentes na faixa de 10 até 20.
     */
    public static void main(String[] args) {
        int somatorio = 0;
        for (int i = 10; i <= 20; i+=2) {
            System.out.println(i);
            somatorio += i;
        } 
        System.out.println("Soma dos pares entre 10 e 20 = " + somatorio);        
    }
    
}
