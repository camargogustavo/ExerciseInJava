package metodos;

public class VerificadorMaioridade {
    public String verificar(int idade) {
        if (idade <= 0) {
            return "Idade inválida";
        }
        if (idade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }

    public static void main(String[] args) {
        VerificadorMaioridade verif = new VerificadorMaioridade();
        System.out.println(verif.verificar(17));
        System.out.println(verif.verificar(18));
        System.out.println(verif.verificar(7));
        System.out.println(verif.verificar(0));
    }
}
