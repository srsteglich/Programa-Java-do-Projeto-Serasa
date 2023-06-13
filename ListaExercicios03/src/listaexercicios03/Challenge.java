/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios03;

/**
 *
 * @author Sergio
 */
public class Challenge {

  public static void main(String[] args) {
        int[] moneyBills = {200, 100, 50, 20, 10, 5, 2, 1};
        int value = 336;
        System.out.printf("The minimum number of each money bill required to get the value %d is:\n", value);
        for (int i = 0; i < moneyBills.length; i++) {
            int moneyBillQuantity = value / moneyBills[i];
            value = moneyBillQuantity * moneyBills[i];
            System.out.printf("R$ %d = %d; ", moneyBills[i], moneyBillQuantity);
        }
}
    
}  