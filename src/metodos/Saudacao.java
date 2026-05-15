package metodos;

public class Saudacao {
    public void saudar(String nome){
        System.out.println("Ola "+nome);
    }

    public static void main(String[] args) {
        Saudacao sau = new Saudacao();
        sau.saudar("Gustavo");
        sau.saudar("Alana");
        sau.saudar("Andre");
    }
}
