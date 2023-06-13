/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios03;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio16 {

    /**
     * @param args the command line arguments
     * 16.Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria 
     * qualquer preço. O monge, necessitando de alimentos, indagou à rainha 
     * sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em 
     * um tabuleiro de xadrez, de tal forma que o primeiro quadro deveria 
     * conter apenas um grão e os quadros subsequentes, o dobro do quadro 
     * anterior. A rainha achou o trabalho barato e pediu que o serviço fosse 
     * executado, sem se dar conta de que seria impossível efetuar o pagamento. 
     * Faça um programa para calcular o número de grãos que o monge esperava 
     * receber.
     */
    public static void main(String[] args) {
        // tabuleiro de xadrez = 64 quadros
        BigInteger graos = new BigInteger("1");
        BigInteger quadroAnterior = new BigInteger("1");
        System.out.println("Quadro " + quadroAnterior + " = " + graos +
                " graos.");
        for (int i = 2; i <= 64; i++) {
            //graos += quadroAnterior * 2;
            //quadroAnterior *= 2;
            graos = graos.add(quadroAnterior.add(quadroAnterior));
            quadroAnterior = quadroAnterior.add(quadroAnterior);
            System.out.println("Quadro " + i + " = " + quadroAnterior + 
                    " graos.");
        }
        JOptionPane.showMessageDialog(null, "Serão necessários " + graos + 
                " grãos de trigo para o pagamento dos serviços do monge.");
        
        
        //encontrando o pagamento em peso
        BigInteger peso = graos.divide(new BigInteger("1000")).
                multiply(new BigInteger("42"));
        JOptionPane.showMessageDialog(null, 
                "Considerando que aproximadamente 1000 grãos de trigo pesa em média 42g, "
                + "o pagamento aproximado dos serviços será de " + peso.divide(new BigInteger("1000000")) + " de toneladas de trigo.");
    }
    
}
