/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios02;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     * 11.Fazer um programa para ler o ano de nascimento de uma pessoa, 
     * calcular e mostrar sua idade e, também, verificar e mostrar se ela 
     * já tem idade para votar (16 anos ou mais) e para conseguir a 
     * Carteira de Habilitação (18 anos ou mais).
     */
    public static void main(String[] args) {
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:"));
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;
        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade + " anos.\n"
                    + "Você não pode votar e nem obter a CNH.");
        } else if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade + " anos. \n"
                    + "Você pode votar mas não pode obter a CNH.");
        } else {
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade + " anos.\n"
                    + "Você pode votar e também obter a CNH.");
        }
    }
    
}
