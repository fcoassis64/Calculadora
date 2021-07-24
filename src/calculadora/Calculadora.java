
package calculadora;
// * @author Francisco

import java.util.Scanner;

public class Calculadora {

    // Declaração de variáveis de classe
    static int soma;
    static int subtracao;
    static int multiplicacao;
    static int divisao;
    static int x;
    static int y;
    
    public static void soma() {
        // Processamento 
        soma = x + y;

        // Saída de dados
        System.out.println("A soma do metodo igual a: " + soma);

    } // End of soma method

    public static void subtracao() {

        // Processamento 
        subtracao = x - y;

        // Saída de dados
        System.out.println("A subtracao  do metodo igua1 a: " + subtracao);

    } // End of method subtracao

    public static void multiplicacao() {

        // Processamento 
        multiplicacao = x * y;

        // Saída de dados
        System.out.println("A multiplicação do metodo igual a: " + multiplicacao);
    } // End of method multiplicacao

    public static void divisao() {

        // Processamento 
        divisao = x / y;

        // Saída de dados
        System.out.println("A divisão  do metodo igual a: " + divisao);
    } // End of method divisao

} // End of Class
