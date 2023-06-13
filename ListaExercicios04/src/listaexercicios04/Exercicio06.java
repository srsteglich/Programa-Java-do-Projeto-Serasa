/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

/**
 *
 * @author mpisching
 * 
 * 6.Escreva um aplicativo que testa se os exemplos de chamadas de métodos da 
 * biblioteca de matemática mostrados abaixo realmente produzem os resultados 
 * indicados:

Método      Descrição	
            Exemplo
abs(x)      Valor absoluto de x (esse método também tem versões para float, int e long)	
            Se x > 0 então abs(x) é x
            Se x = 0 então abs(x) é 0
            Se x < 0 então abs(x) é –x
ceil(x)     Arrendonda x para o menor inteiro não menor que x.	
            ceil (9.2) é 10.0
            ceil (-9.8) é –9.0
cos(x)      Co-seno trigonométrico de x (x em radianos)	
            cos (0.0) é 1.0
exp(x)      Método exponencial ex	
            exp (1.0) é 2.71828
            exp (2.0) é 7.38906
floor(x)    Arrendonda x para o maior inteiro não maior que x.	
            floor (9.2) é 9.0
            floor (-9.8) é –10.0
max(x,y)    Maior valor entre x e y	
            max(2.3,12.7) é 12.7
            max(-2.3,-12.7) é –2.3
min(x,y)    Menor valor entre x e y	
            min(2.3,12.7) é 2.3
pow(x,y)    x elevado à potência y (xy)	
            pow(2.0,7.0) é 128.0
sqrt(x)     Raiz quadrada de x	
            sqrt(900.0) é 30.0

 */
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Valor absoluto -10: " + Math.abs(-10));
        System.out.println("=======================================");
        System.out.println("Arrendondamento de 9.2 com ceil: " + Math.ceil(9.2));
        System.out.println("Arrendondamento de -9.8 com ceil: " + Math.ceil(-9.8));
        System.out.println("Arrendondamento de 9.2 com floor: " + Math.floor(9.2));
        System.out.println("Arrendondamento de -9.8 com floor: " + Math.floor(-9.8));
        System.out.println("=======================================");
        System.out.println("Co-seno trigonométrico de 0.0: " + Math.cos(0.0));
        System.out.println("=======================================");
        System.out.println("Exponencial de 1.0: " + Math.exp(1.0));
        System.out.println("Exponencial de 2.0: " + Math.exp(2.0));
        System.out.println("=======================================");
        System.out.println("Maior valor entre 2.3 e 12.7: " + Math.max(2.3, 12.7));
        System.out.println("Maior valor entre -2.3 e -12.7: " + Math.max(-2.3, -12.7));
        System.out.println("Menor valor entre 12.3 e 12.7: " + Math.min(2.3, 12.7));
        System.out.println("Menor valor entre -2.3 e -12.7: " + Math.min(-2.3, -12.7));
        System.out.println("=======================================");
        System.out.println("2 elevado a potência de 7: " + Math.pow(2.0, 7.0));
        System.out.println("3 elevado a potência de 5: " + Math.pow(2.0, 32.0));
        System.out.println("Raiz quadrada de 900.0: " + Math.sqrt(900.0));
    }
    
}
