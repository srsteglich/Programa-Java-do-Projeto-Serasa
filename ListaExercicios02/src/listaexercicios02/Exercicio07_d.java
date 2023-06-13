/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios02;

import java.util.Scanner;

/**
 *
 * @author mpisching
 */
public class Exercicio07_d {

    /**
     * @param args the command line arguments
     * d.Ler quatro notas escolares de um aluno e imprimir uma mensagem dizendo
     * que o aluno foi aprovado, se o valor da média escolar for maior ou igual
     * a 6. Se o valor da média for menor que 6, solicitar a nota da 
     * recuperação, somar com o valor da média e obter a nova média.
     * Se a nova média for maior ou igual a 6, apresentar a mensagem dizendo 
     * que o aluno foi aprovado mediante avaliação de recuperação. 
     * Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. 
     * Apresentar junto com as mensagens o valor da média do aluno,
     * para qualquer condição.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 4 notas de um aluno:");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();
        
        int media = (n1 + n2 + n3 + n4) / 4;
        
        if (media >= 6) {
            System.out.println("Aluno aprovado com media " + media);
        } else {
            System.out.println("Aluno em recuperação - Media:  " + media );
            System.out.print("Informe a nota obtida na recuperação: ");
            int notaRec = entrada.nextInt();
            media = (media + notaRec) / 2;
            if (media >= 6) {
                System.out.println("Aluno aprovado com media " + media + " apos a recuperacao.");
            } else {
                System.out.println("Mesmo após a recuperação o aluno não atingiu a média para aprovação:  " + media);
            }
        }
    }
    
}
