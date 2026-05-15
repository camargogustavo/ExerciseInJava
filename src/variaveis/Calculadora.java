package variaveis;

public class Calculadora {
    int num1 = 10;
    int num2 = 10;
    double num12 = 10;
    double num22 = 10;

    public void imprime() {
        System.out.println("Soma: "+(num1 + num2));
        System.out.println("Multiplicação: "+(num1 * num2));
        System.out.println("Subtração: "+(num1 - num2));
        System.out.println("Divisão: "+(num1 / num2));

        System.out.println("Soma: "+(num12 + num22));
        System.out.println("Multiplicação: "+(num12 * num22));
        System.out.println("Subtração: "+(num12 - num22));
        System.out.println("Divisão: "+(num12 /  num22));
    }

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.imprime();
    }
}