package dayOne;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero, vou-lhe dizer se é impar ou par");
        int numero = input.nextInt();

        String result = (numero % 2 == 0) ? "par" : "Impar";
        System.out.println(result);
        //variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;

        System.out.println("Digite o valor do seu salario");
        double num2 = input.nextDouble();
        String resultado2 = (num2 < 2500) ? "Isento" : "Tributado";
        System.out.println(resultado2);



    }
}
