
package listaexercicios04;
public class Exercicio11_Celsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("24 graus Celsius equivale a " + fahrenheit(24) + " Fahrenheit");
        System.out.println("80 graus Fahrenheit equivale a " + celsius(80) + " Celsius");
        
    }
    
    public static int celsius(int fahrenheit) {
        return (int)Math.floor(5.0 / 9.0 * (fahrenheit - 32));
    }
    
    public static int fahrenheit(int celsius) {
        return (int)Math.floor(9.0 / 5.0 * celsius + 32);
    }
    
}
