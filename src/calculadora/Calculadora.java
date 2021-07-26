
package calculadora;
// * @author Francisco

import java.util.Scanner;

public class Calculadora {

    // Declaração de variáveis de classe
    int soma;
    int subtracao;
    int multiplicacao;
    int divisao;
    int x;
    int y;
    
    public void soma() {
        // Processamento 
        soma = x + y;

        // Saída de dados
        System.out.println("A soma do metodo igual a: " + soma);

    } // End of soma method
    
    public  int soma(int x, int y){
    // Declaração de variáveis
    int soma = x + y;
    
        //System.out.println("[Método soma com parâmetros] Soma = " + soma);
        return soma;
    } // End of method Soma 2
    public  void subtracao() {

        // Processamento 
        subtracao = x - y;

        // Saída de dados
        System.out.println("A subtracao  do metodo igua1 a: " + subtracao);

    } // End of method subtracao

    public  void multiplicacao() {

        // Processamento 
        multiplicacao = x * y;

        // Saída de dados
        System.out.println("A multiplicação do metodo igual a: " + multiplicacao);
    } // End of method multiplicacao

    public void divisao() {

        // Processamento 
        divisao = x / y;

        // Saída de dados
        System.out.println("A divisão  do metodo igual a: " + divisao);
    } // End of method divisao

} // End of Class
