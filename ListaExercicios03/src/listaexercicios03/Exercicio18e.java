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
public class Exercicio18e {

    /**
     * @param args the command line arguments
     * e.Apresentar os quadrados dos números inteiros de 2 a 50.
     */
    public static void main(String[] args) {
        int i = 2;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append("Quadrado de ").append(i).append(" = ").append((int)Math.pow(i,2)).append("\n");
            i++;
        } while (i <= 50);
        System.out.println(sb);
    }
    
}
