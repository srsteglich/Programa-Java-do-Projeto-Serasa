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
public class Exercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        String nome = JOptionPane.showInputDialog("Nome do funcionário: ");
        float salario = Float.parseFloat(JOptionPane.showInputDialog(""
                + "Salário: "));
        String resultado = "Nome: [" + nome + "]\n";
        float novoSalario = 0.0f;
        if (salario >= 0.0 && salario <= 400.00) {
            novoSalario = salario + (salario * 0.15f);
            resultado += "Aumento de 15%";
        } else if (salario >= 400.01 && salario <= 700.00) {
            novoSalario = salario + (salario * 0.12f);
            resultado += "Aumento de 12%";
        } else if (salario >= 700.01 && salario <= 1000.00) {
            novoSalario = salario + (salario * 0.10f);
            resultado += "Aumento de 10%";
        } else if (salario >= 1000.01 && salario <= 1800.00) {
            novoSalario = salario + (salario * 0.07f);
            resultado += "Aumento de 7%";
        } else if (salario >= 1800.01 && salario <= 2500.00) {
            novoSalario = salario + (salario * 0.04f);
            resultado += "Aumento de 4%";
        } else {
            resultado += "Não há aumento de salário";
        }
        resultado += "\n" + "Salário Atual = R$ " + df.format(salario);
        if (novoSalario > 0.0) {
            resultado += "\n" + "Novo Salário = R$ " + df.format(novoSalario);
        }
        
        JOptionPane.showMessageDialog(null, resultado, "Reajuste Salarial", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, resultado);
    }
    
}
