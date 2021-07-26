package calculadora;

import java.util.Scanner;
// @author Francisco

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Instanciação de objetos
        Calculadora calc = new Calculadora();
        Calculadora calc2 = new Calculadora();

        System.out.print("Digite o valor de x: ");
        calc.x = in.nextInt();

        System.out.print("Digite o valor de y: ");
        calc.y = in.nextInt();
        
        System.out.print("Digite o valor de x para calc2: ");
        calc2.x = in.nextInt();
        
        System.out.print("Digite o valor de y para calc2: ");
        calc2.y = in.nextInt();
        

        // Chamada para o metodo soma passando como parametros os valores que
        // estão armazenados em X e Y.
        calc.soma();
        int somaApp = calc.soma(40,50);
        System.out.println("[Método main] Soma = " + somaApp);
        calc.subtracao();
        calc.multiplicacao();
        calc.divisao();
        
        System.out.println("");
        System.out.println("============== Calc2 ==============");
        System.out.println("");
        calc2.soma();
        calc2.subtracao();
        calc2.multiplicacao();
        calc2.divisao();

        in.close();
    } // End of Main    
} // End of App Class
