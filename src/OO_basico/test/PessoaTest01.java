package OO_basico.test;

import OO_basico.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gustavo","111.111.111.11",18);
        Pessoa pessoa2 = new Pessoa("Alana","222.222.222.22",38);
        pessoa.imprime();
        System.out.println("---------");
        pessoa2.imprime();
        System.out.println("---------");
        pessoa.setNome("Gustavo Camargo");
        pessoa2.setNome("Alana Camargo");
        pessoa.setIdade(18);
        pessoa2.setIdade(37);
        pessoa.imprime();
        System.out.println("---------");
        pessoa2.imprime();
    }
}
