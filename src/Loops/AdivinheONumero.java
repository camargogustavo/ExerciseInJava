package Loops;

import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        int secreto = 7;
        int numDigitado;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Digite um numero de 1 a 10, tente advinhar o numero");
            numDigitado = input.nextInt();
            if (numDigitado != secreto){
                System.out.println("Errou, tente novamente");
            }
        } while (numDigitado != secreto);
        System.out.println("Acerto");
        //Enquanto o numero digitado for diferente do secreto ele repete, quando a condicao for verdadeira ele vai para proxima linha
    }
}
