package dayOne;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero, vou-lhe dizer se é impar ou par");
        int numero = input.nextInt();
        String resultado = "";

        if (numero % 2 == 0){
            resultado = "Par";
        }else{
            resultado = "Impar";
        }

        System.out.println(resultado);

        System.out.println("Digite o valor do seu salario");
        double num2 = input.nextDouble();

        if (num2 < 2500){
            System.out.println("Isento");
        } else if (num2 >= 2500) {
            System.out.println("Tributado");
        }

        String result = (numero % 2 == 0) ? "par" : "Impar";
        System.out.println(result);
        //variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;



    }
}
