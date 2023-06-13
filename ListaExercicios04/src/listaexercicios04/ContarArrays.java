/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaexercicios04;

/**
 *
 * @author SRSistemas
 */
public class ContarArrays {

    public static void main(String[] args) {
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
        for(int i : arrayNum)
            total += i;
        System.out.printf("Total de elementos arrayNum: %d\n", total);
    }
}

    
