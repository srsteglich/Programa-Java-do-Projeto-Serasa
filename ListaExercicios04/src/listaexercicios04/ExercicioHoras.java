/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaexercicios04;

import java.util.Date;

public class ExercicioHoras {
    
    public static void main(String[] args) {
        Date horaa  = new Date();
        Date horad  = new Date();
        System.out.println("Horário: " + horad.toString());
        horaa.setTime(horaa.getTime() - (100 * 40 * 60 * 10));  // 40 minutos antes
        horad.setTime(horad.getTime() + (100 * 60 * 60 * 10));  // uma hora depois    
        System.out.println("Horário 40 minutos antes: " + horaa.toString());        
        System.out.println("Horário uma hora depois: " + horad.toString());        
    }                
}
