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
public class Exercicio07_b_c {

    /**
     * @param args the command line arguments
     * b.Ler quatro notas escolares de um aluno e imprimir uma mensagem 
     * dizendo que o aluno foi aprovado, se o valor da média escolar for maior
     * ou igual a 6. Se o aluno não foi aprovado, apresentar uma mensagem 
     * informando esta condição.  
     * c.Apresentar junto com uma das mensagens o valor da média do aluno para 
     * qualquer condição.
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
            System.out.println("Aluno reprovado com media " + media);
        }
    }
    
}
