package metodos;

public class CalculadoraMetados {

    public int somar(int num1, int num2){
        return num1 + num2;
    }
    public int subtrair(int num1, int num2){
        return num1 - num2;
    }
    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    public int dividir(int num1, int num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        CalculadoraMetados cal1 = new CalculadoraMetados();
        System.out.println("Soma: "+cal1.somar(10,10));
        System.out.println("Subtrair: "+cal1.subtrair(10,10));
        System.out.println("Multiplicar: "+cal1.multiplicar(10,10));
        System.out.println("Dividir: "+cal1.dividir(10,10));

    }
}
