/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios04;

/**
 *
 * @author mpisching
 * 17.	Propósito: fazer um método que invoca outros métodos
 * Escreva um método que receba 3 notas de um aluno e uma letra. 
 * Se a letra for A, este método chama outro para calcular a média aritmética 
 * das notas do aluno. Se a letra for P, chama um método para calcular a média
 * ponderada (considerando os pesos: 5, 3 e 2). Caso a letra for H, então será 
 * invocado o método para calcular a média harmônica. Após calcular a média 
 * (seja qual for), o método deverá retornar a média calculada para que possa
 * ser mostrada ao usuário por um método de impressão de resultado.
 * 
 * Observação: faça um menu de opções para chamar cada um dos métodos para o 
 * cálculo da média. O programa deverá executar o menu de opções por n vezes. 
 * A condição de parada do programa será o valor S.
 * 
 * Sobre médias (conceito, fórmulas, aplicações), consulte:
 *          https://www.infoescola.com/matematica/medias-aritmetica-geometrica-harmonica/
 *          https://www.educamaisbrasil.com.br/enem/matematica/soma-de-fracoes
 *          https://pt.wikipedia.org/wiki/M%C3%A9dia_harm%C3%B4nica
 *          https://www.professorferretto.com.br/media-harmonica/
 */
public class Exercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        char opcao = '\0', continuar = '\0';
        float n1, n2, n3;
        do {
            System.out.println("Informe 3 notas de um aluno");
            n1 = entrada.nextFloat();
            n2 = entrada.nextFloat();
            n3 = entrada.nextFloat();
            System.out.print("Escolha um tipo de média: \n"
                    + "A - Aritmética\n"
                    + "P - Ponderada\n"
                    + "H - Harmônica\n"
                    + "Opção: ");
            opcao = entrada.next().toUpperCase().charAt(0);
            
            if (opcao == 'A' || opcao == 'P' || opcao == 'H' ) {
                float media = calcular(n1, n2, n3, opcao);
                imprimir(media, (opcao == 'A'? "Aritmética" : (opcao == 'P' ? "Ponderada" : "Harmônica")));
            }
            System.out.print("Deseja continuar? (s/n)? ");
            continuar = entrada.next().toUpperCase().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }
    
    public static float calcular(float nota1, float nota2, float nota3, char tipoMedia) {
        float result = 0.0f;
        switch (tipoMedia) {
            case 'A': case 'a': result = calcularMediaAritmetica(nota1, nota2, nota3);break;
            case 'P': case 'p': result = calcularMediaPonderada(nota1, nota2, nota3);break;
            case 'H': case 'h': result = calcularMediaPonderada(nota1, nota2, nota3);break;
        }
        return result;
    }
    
    /**
     * Método para calcular a média aritmética de 3 notas 
     * @param nota1 
     * @param nota2
     * @param nota3
     * @return 
     */
    public static float calcularMediaAritmetica(float nota1, float nota2, float nota3) {
        return (nota1 + nota2 + nota3) / 3.0f;
    }
    
    /**
     * Método para calcular a média ponderada de três notas, cujos pesos são
     *      5, 3 e 2 respectivamente.
     * @param nota1
     * @param nota2
     * @param nota3
     * @return 
     */
    public static float calcularMediaPonderada(float nota1, float nota2, float nota3) {
        return ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
    }
    
    /**
     * Método para calcular a média harmônica entre 3 notas de um aluno.
     * @param nota1
     * @param nota2
     * @param nota3
     * @return 
     */
    public static float calcularMediaHarmonica(float nota1, float nota2, float nota3) {
        return 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));
    }
    
    /**
     * Método para imprimir a média calculada das três notas de alunos.
     * @param media
     * @param tipo 
     */
    public static void imprimir(float media, String tipo) {
        System.out.println("A média " + tipo + " das notas informadas é " 
                + media + "\n");
    }
}
