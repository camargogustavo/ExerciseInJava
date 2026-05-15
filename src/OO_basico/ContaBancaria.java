package OO_basico;

public class ContaBancaria {
    private String titular;
    private double saldo = 0;
    private int numeroConta;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void imprime() {
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.println("Titular da Conta: " + getTitular());
        System.out.println("Saldo da Conta: " + getSaldo());
    }

    public void depositar(double num1) {
        if (num1 <= 0) {
            System.out.println("Valor invalido");
        } else {
            this.saldo = this.saldo + num1;
        }
    }

    public void sacar(double num1) {
        if (num1 > this.saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.saldo = this.saldo - num1;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
