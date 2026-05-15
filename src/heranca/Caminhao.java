package heranca;

import interfaces.Carregavel;
import interfaces.Veiculo;

public class Caminhao implements Veiculo, Carregavel {
    @Override
    public void acelerar() {
        System.out.println("Caminhao acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Caminhao freando");
    }

    @Override
    public int getVelocidadeMaxima() {
        return 120;
    }

    @Override
    public void carregar() {
        System.out.println("Caminhao pronto para carregar ");
    }
}
