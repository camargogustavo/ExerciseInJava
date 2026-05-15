package heranca;

import interfaces.Veiculo;

public class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Moto freiando");
    }

    @Override
    public int getVelocidadeMaxima() {
        return 180;
    }
}
