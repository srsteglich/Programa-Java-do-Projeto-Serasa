/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio17 {

    /**
     * @param args the command line arguments
     * 17.Zezinho comprou um microcomputador para controlar o rendimento diário 
     * de seu trabalho como pescador. Toda vez que ele traz um peso de peixes
     * maior que o estabelecido pelo regulamento de pesca do estado de 
     * Santa Catarina (50 quilos) deve pagar uma multa de R$ 4,00 por quilo 
     * excedente. Zezinho precisa que você faça um programa que leia o peso 
     * de peixes e verifique se há excesso. Se houver, mostrar o excesso e o 
     * valor da multa que Zezinho deverá pagar. Caso contrário mostrar uma 
     * mensagem que ele não deve pagar multa.
     */
    public static void main(String[] args) {
        //limite 50kg
        //valor da multa R$ 4,00 por quilo excedente
        DecimalFormat df = new DecimalFormat("0.00");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Peso: "));
        if (peso > 50.0f) {
            float diferenca = peso - 50.0f;
            float multa = diferenca * 4.0f;
            JOptionPane.showMessageDialog(null, "Peso excedente: " + diferenca + "\n"
                    + "Multa: R$ " + df.format(multa));
        } else {
            JOptionPane.showMessageDialog(null, "Não houve peso excedente, não há multa!");
        }
        
    }
    
}
