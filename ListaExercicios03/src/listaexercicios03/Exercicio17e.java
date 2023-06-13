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
public class Exercicio17e {

    /**
     * @param args the command line arguments
     * e.Apresentar todos os números divisíveis por 4 que sejam menores que 200. 
     * Para verificar se o número é divisível por 4, efetuar dentro da malha a 
     * verificação lógica desta condição com a instrução if, perguntando se o 
     * número é divisível; sendo, mostre-o; não sendo, passe para o próximo 
     * passo. A variável que controlará o contador deverá ser iniciada com 
     * valor 1.
     */
    public static void main(String[] args) {
        int n = 1;
        System.out.println("Números < 200 que são divisíveis por 4:");
        while (n < 200) {
            if (n % 4 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
    
}
