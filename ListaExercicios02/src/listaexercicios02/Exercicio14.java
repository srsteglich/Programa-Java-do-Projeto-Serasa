/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios02;

import javax.swing.JOptionPane;

/**
 *
 * @author mpisching
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String professor1 = JOptionPane.showInputDialog("Nome do primeiro professor");
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora/aula: "));
        int cargaHoraria1 = Integer.parseInt(JOptionPane.showInputDialog("Carga horária trabalhada: "));
        String professor2 = JOptionPane.showInputDialog("Nome do segundo professor");
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora/aula "));
        int cargaHoraria2 = Integer.parseInt(JOptionPane.showInputDialog("Carga horária trabalhada: "));
        double salario1 = valor1 * cargaHoraria1;
        double salario2 = valor2 * cargaHoraria2;
        
        if (salario1 > salario2) {
            JOptionPane.showMessageDialog(null, "O professor " + professor1 + " possui o maior salário: " + salario1);
        } else if (salario2 > salario1) {
            JOptionPane.showMessageDialog(null, "O professor " + professor2 + " possui o maior salário: " + salario2);
        } else {
            JOptionPane.showMessageDialog(null, "Os professores " + professor1 + " e " + professor2 + " possuem salários iguais: " + salario2); 
        }

    }
    
}
