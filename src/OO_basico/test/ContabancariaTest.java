package OO_basico.test;

import OO_basico.ContaBancaria;

public class ContabancariaTest {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Gustavo",123123123);
        ContaBancaria c2 = new ContaBancaria("Alana", 321321321 );
        c1.depositar(10000);
        c1.imprime();
        System.out.println("---------");
        c1.sacar(1000);
        c1.imprime();

        c2.depositar(1000);
        c2.imprime();
        System.out.println("---------");
        c2.sacar(10000);
        System.out.println("---------");
        c1.imprime();
    }
}
