/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios03;

/**
 *
 * @author Sergio
 */
public class Challenge2Matriz {
   public static void main(String[] args) {
        int[] array = new int[5];
        int aux = 1;
        
        for (int i = 0; i < array.length; i++) {
        	aux = aux * (i + 1);
        	array[i] = aux / 2;
        }

        System.out.println(array[3]);
   }

    
}
