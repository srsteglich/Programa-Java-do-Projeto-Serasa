/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

/**
 *
 * @author mpisching
 * 13.Faça um método que receba um número inteiro e positivo N como parâmetro 
 * e retorne a soma dos números inteiros existentes entre o número 1 e N (inclusive).
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Informe um número inteiro e positivo: ");
        int num = entrada.nextInt();
        if (num > 0) {
            System.out.println("A soma dos inteiros entre 1 e " + num + ""
                    + " = " + somaInteiros(num));
        } else {
            System.out.println("entrada inválida.");
        }
    }
    
    public static int somaInteiros(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += n;
        }
        return soma;
    }
    
}
