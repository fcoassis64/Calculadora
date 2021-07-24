package calculadora;

import java.util.Scanner;
// @author Francisco

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        Calculadora.x = in.nextInt();

        System.out.print("Digite o valor de y: ");
        Calculadora.y = in.nextInt();

        // Chamada para o metodo soma passando como parametros os valores que
        // estão armazenados em X e Y.
        Calculadora.soma();
        Calculadora.subtracao();
        Calculadora.multiplicacao();
        Calculadora.divisao();

        in.close();
    } // End of Main    
} // End of App Class
