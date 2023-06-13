/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaexercicios04;

import javax.swing.JOptionPane;

/**
 *
 * @author SRSistemas
 */
public class TesteGabarito {
    
    public static void main(String[] args) {
            menu();
    }
    
    public static void menu() {   
        int id_cod;
        char ques1, ques2, ques3, ques4, ques5;
        float peso1=0 , peso2=0, peso3=0, peso4=0, peso5=0, mediapond ;
        
        
        id_cod = Integer.parseInt (JOptionPane.showInputDialog("Informe codigo"));  
//        ques1 = JOptionPane.showInputDialog ("Informe questão 1").charAt(0);                
//        ques2 = JOptionPane.showInputDialog ("Informe questão 2").charAt(0);                
//        ques3 = JOptionPane.showInputDialog ("Informe questão 3").charAt(0);                
//        ques4 = JOptionPane.showInputDialog ("Informe questão 4").charAt(0);                
//        ques5 = JOptionPane.showInputDialog ("Informe questão 5").charAt(0);                
        
        if (id_cod <= 100) {
            ques1 = JOptionPane.showInputDialog ("Informe questão 1").charAt(0);                
            if ((ques1 == 'a') || (ques1 == 'A'))  {
                peso1 = 1;
                System.out.println("MARCOU Questao1 ");
            }
            ques2 = JOptionPane.showInputDialog ("Informe questão 2").charAt(0);                            
            if ((ques2 == 'b') || (ques2 == 'B')) {
                peso2 = 2; 
                System.out.println("MARCOU 2");
            }
            ques3 = JOptionPane.showInputDialog ("Informe questão 3").charAt(0);                            
            if ((ques3 == 'c') || (ques3 == 'C')) {
                peso3 = 3;
                System.out.println("MARCOU 3");
            } 
            ques4 = JOptionPane.showInputDialog ("Informe questão 4").charAt(0);                
            if ((ques4 == 'd') || (ques4 == 'D')) {                        
                peso4 = 1;              
                System.out.println("MARCOU 4 ");
            }
            ques5 = JOptionPane.showInputDialog ("Informe questão 5").charAt(0);                
            if ((ques5 == 'a') || (ques5 == 'A')) {                        
                peso5 = 2;
                System.out.println("MARCOU 5 ");
            }            
            //System.out.println("Está menos de 100 alunos");
            mediapond = ((peso1 + peso2 + peso3 + peso4 + peso5) /9) *10;    
            System.out.println("Media Ponderada: " + mediapond);
            
        }else {
            System.out.println("Está mais de 100 alunos");
        }
    }
}
