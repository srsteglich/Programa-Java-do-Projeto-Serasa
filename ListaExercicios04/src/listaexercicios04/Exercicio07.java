/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

/**
 *
 * @author mpisching
 */
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 0.0;
        System.out.println("" +
                "a)	x = Math.abs(7.5) = " + (x = Math.abs(7.5)) + "\n" +
                "b)	x = Math.floor(7.5) = " + (x = Math.floor(7.5)) + "\n" +
                "c)	x = Math.abs(0.0) = " + (x = Math.abs(0.0)) + "\n" +
                "d)	x = Math.ceil(0.0) = " + (x = Math.ceil(0.0)) + "\n" +
                "e)	x = Math.abs(-6.4) = " + (x = Math.abs(-6.4)) + "\n" +
                "f)	x = Math.ceil(-6.4) = " + (x = Math.ceil(-6.4)) + "\n" +
                "g)	x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5))) = " + 
                    (x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)))));
    }
    
}
