package Arrays;

public class ArrayNumeros {
    public static void main(String[] args) {
        int[] arrayNumber = {1,2,3,4,5};

        for (int i = 0; i < arrayNumber.length; i++){
            System.out.println(arrayNumber[i]);
        }


        int[] arrayNumber2 = {43, 7, 120, 21, 56};
        int maior = arrayNumber2[0];
        for (int i = 0; i < arrayNumber2.length; i++){
            if (arrayNumber2[i] > maior){
                maior = arrayNumber2[i];
            }
        }
        System.out.println("Maior valor: " + maior);

        int[] arrayInvertido = {5, 6, 7 ,8, 9, 10};
        for (int i = arrayInvertido.length - 1; i >= 0; i--){
            System.out.println(arrayInvertido[i]);
        }
    }
}
