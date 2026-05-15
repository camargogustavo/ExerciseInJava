package heranca.test;

import heranca.Carro;
import heranca.Moto;
import heranca.Caminhao;
import interfaces.Veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo c1 = new Carro();
        Veiculo m1 = new Moto();
        Veiculo ca1 = new Caminhao();
        System.out.println("--- Carro ---");
        c1.acelerar();
        c1.frear();
        System.out.println(c1.getVelocidadeMaxima());
        System.out.println("---------");
        System.out.println("--- Moto ---");
        m1.acelerar();
        m1.frear();
        System.out.println(m1.getVelocidadeMaxima());
        System.out.println("---------");
        System.out.println("--- caminhao ---");
        ca1.acelerar();
        ca1.frear();
        System.out.println(ca1.getVelocidadeMaxima());

    }
}
