/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

/**
 *
 * @author mpisching
 */
public class Exercicio04 {
    public static int x, y, z;
    /**
     * @param args the command line arguments
     *4. Escrever um programa que lê 3 valores (a, b e c) e calcula:
	A área do trapézio que tem a como base maior, b como base menor e c como altura.

            área do trapézio=  ((basemaior+basemenor))/2*altura

	A área do quadrado que tem o valor da variável b como lado

            área do quadrado=〖lado〗^2

	A área da superfície de um cubo que tem c por aresta

            área do cuto=6* 〖aresta〗^2

     */
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        int opcao = 0; char op = 's';
        float resultado = 0.0f;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        do {
            System.out.println("Informe 3 valores: ");
            float a = entrada.nextFloat();
            float b = entrada.nextFloat();
            float c = entrada.nextFloat();
            
            do {
                System.out.println("O que você deseja calcular? \n"
                        + "1 - Área do trapézio\n"
                        + "2 - Área do quadrado\n"
                        + "3 - Área da superfície de um cubo\n"
                        + "0 - Voltar");
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 1: 
                        resultado = calcularAreaTrapezio(a, b, c); 
                        imprimir(resultado, "Trapézio");
                        break;
                    case 2: 
                        resultado = calcularAreaQuadrado(b);
                        imprimir(resultado, "Quadrado");
                        break;
                    case 3:
                        resultado = calcularAreaSuperficieCubo(c);
                        imprimir(resultado, "Superfície de um Cubo");
                        break;
                    case 0: 
                        System.out.println("");break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
            System.out.print("Executar novamente (S/N)? ");
            op = entrada.next().charAt(0);
        } while (op == 's' || op == 'S');
    }
    
    /**
     * Método para calcular a area do trapézio
     * @param baseMaior
     * @param baseMenor
     * @param altura
     * @return float
     */
    public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) {
        return ((baseMaior + baseMenor)/2) * altura;
    }
    
    /**
     * Método para imprimir o resultado da area calculada
     * @param area - valor da área calculada
     * @param tipo - o tipo de figura que foi calculada
     */
    public static void imprimir(float area, String tipo) {
        System.out.println("A area do " + tipo + " e igual a " + area + "\n");
    }
    
    /**
     * Método para calcular a área de um quadrado
     * @param lado - o lado do quadrado
     * @return float - a á area calculada
     */
    public static float calcularAreaQuadrado(float lado) {
        return lado * lado;
    }
    
    /**
     * Cálcula a área da superfície de um cubo
     * @param aresta
     * @return float - a área calculada
     */
    public static float calcularAreaSuperficieCubo(float aresta) {
        return 6 * (aresta * aresta);
    }
    
}
