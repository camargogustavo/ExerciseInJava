package heranca.test;

import heranca.Animal;
import heranca.Cachorro;
import heranca.Gato;

public class AnimalTest01 {
    public static void main(String[] args) {
        Animal gato = new Gato("Fumaca",1);
        Animal cachorro = new Cachorro("Faisca", 1);
        Animal cachorro2 = new Cachorro("Fogo", 1);
        Animal gato2 = new Gato("A",1);


        Animal[] arrayAnimais = new Animal[3];
        arrayAnimais[0] = gato;
        arrayAnimais[1] = cachorro;
        arrayAnimais[2] = cachorro2;

        for (int i = 0; i < arrayAnimais.length; i++){
            arrayAnimais[i].emitirSom();
        }



        System.out.println("Nome: "+gato.getNome());
        System.out.println("Idade: "+gato.getIdade());
        gato.emitirSom();
        System.out.println("---------");
        System.out.println("Nome: "+cachorro.getNome());
        System.out.println("Idade: "+cachorro.getIdade());
        cachorro.emitirSom();
    }
}
