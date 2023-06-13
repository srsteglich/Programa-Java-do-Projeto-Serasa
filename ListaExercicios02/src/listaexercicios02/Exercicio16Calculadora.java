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
public class Exercicio16Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe dois valores inteiros: ");
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        System.out.println("Escolha uma operação:" + "\n"
                + "1 - Adicao" + "\n"
                + "2 - Subtracao" + "\n"
                + "3 - Muliplicacao" + "\n"
                + "4 - Divisao");
        byte op = entrada.nextByte();
        switch (op) {
            case 1: System.out.println(x + " + " + y + " = " + (x + y)); break;
            case 2: System.out.println(x + " - " + y + " = " + (x - y)); break;
            case 3: System.out.println(x + " * " + y + " = " + (x * y)); break;
            case 4: System.out.println(x + " / " + y + " = " + ((double)x / (double)y)); break;
            default: System.out.println("Operacao inválida!!!");
        }
		
		entrada.close();
    }
    
}
