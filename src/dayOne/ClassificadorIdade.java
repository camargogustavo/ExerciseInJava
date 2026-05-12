package dayOne;

import java.util.Scanner;

public class ClassificadorIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = input.nextInt();;

        if (idade < 0){
            System.out.println("Idade Invalida");
        } else if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <=17 ) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59 ){
            System.out.println("Adulto");
        } else if (idade >= 60) {
            System.out.println("Idoso");

        }
    }
}