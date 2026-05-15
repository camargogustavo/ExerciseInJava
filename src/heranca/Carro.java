package heranca;

import interfaces.Veiculo;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro Freiando");
    }

    @Override
    public int getVelocidadeMaxima() {
        return 200;
    }
}
