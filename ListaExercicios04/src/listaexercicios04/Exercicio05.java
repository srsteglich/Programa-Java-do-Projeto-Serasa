/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     * 	Faça um programa que determine o volume de uma caixa de d’água 
     * cilíndrica, sendo que o raio e a altura devem ser fornecidos pelo 
     * usuário. O cálculo do volume da caixa deverá ser realizado por um método.

            v=PI*〖raio〗^2*altura 

     */
    public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog(""
                + "Raio do reservatório: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(""
                + "Altura do reservatório: "));
        
        double volume = calcularVolume(raio, altura);
        JOptionPane.showMessageDialog(null, ""
                + "Dado o raio " + raio + " e a altura de " + altura + ""
                        + " o volume da caixa d'agua será de " + volume );
    }

    /**
     * Método para calcular o volume de um reservatório cilíndrico
     * @param raio o raio do reservatório
     * @param altura a altura do reservatório
     * @return double 
     */
    private static double calcularVolume(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
    
}
