package atividade;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Aula5EmailCorporativo {
	   public static void main(String[] args) {
	        int horas, minu, dia, diachar;
	        String opcao ="";
	        Date horad  = new Date();
	        System.out.println("Horas do Sistema: " + horad.toString());
	        Calendar data = Calendar.getInstance();
	        horas = data.get(Calendar.HOUR_OF_DAY);
	        minu = data.get(Calendar.MINUTE);	       
	        dia = data.get(Calendar.DAY_OF_MONTH);
	        diachar = data.get(Calendar.DAY_OF_WEEK);
	       
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("________________________________________________________");
	        System.out.println();
	        System.out.println("Só Hora: " +horas);
	        System.out.println("Só Minutos "+minu);	       	        	       
	        System.out.println("Hoje é dia "+dia+"  - Dia da Semana: "+diachar);
	        System.out.println("________________________________________________________");	        
	        System.out.println("Escolhe a letra [F]-Pessoa Física ou [J]-Pessoa Jurídica");
	        opcao = entrada.nextLine().toUpperCase();
	        	       	        
	        if (horas >= 6 && horas < 12) {
	        	System.out.println( "  Bom dia!");
	        }else if (horas >= 12 && horas < 18) {
	        	System.out.println( "  Boa tarde!");
	        }else if (horas >= 18 && horas <= 23) {
	        	System.out.println( "  Boa noite!");
	        }else if (horas >= 0 && horas <= 5) {
	        	System.out.println("   Boa madrugada!");
	        }
	        
	        switch (opcao) {
				case "F" : 
					System.out.println("  Ao Pessoa Física...");
					break;			
				case "J": 
					System.out.println("  Ao Pessoa Jurídica...");
					break;				
				default:
					System.out.println("  Opção Invalida!!!");
			}	        
	        entrada.close();
	}
}
