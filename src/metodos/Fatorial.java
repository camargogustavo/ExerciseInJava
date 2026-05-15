package metodos;

public class Fatorial {
    public int calcular(int num1){
        if (num1 == 0){
            return 1;
        }
        int resultado = 1;
        for (int i = 1; i <= num1; i++){
            resultado = resultado * i;
        }
        return resultado;

    }

    public static void main(String[] args) {
        Fatorial fat = new Fatorial();
        System.out.println(fat.calcular(5));
        System.out.println(fat.calcular(0));
        System.out.println(fat.calcular(1));
    }
}
