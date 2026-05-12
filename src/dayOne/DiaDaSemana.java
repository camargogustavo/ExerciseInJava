package dayOne;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite de 1 a 7 o dias da semena");
        int diaSemana = input.nextInt();
        String nomeDia = "";
        switch (diaSemana) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-Feira";
                break;
            case 3:
                nomeDia = "Terça-Feira";
                break;
            case 4:
                nomeDia = "Quarta-Feira";
                break;
            case 5:
                nomeDia = "Quinta-Feira";
                break;
            case 6:
                nomeDia = "Sexta-Feira";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
            default:
                nomeDia = "Dia Invalido";
                break;
        }
        System.out.println(nomeDia);
    }

}