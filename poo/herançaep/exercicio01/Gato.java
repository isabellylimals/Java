package exercicio01;

import java.util.ArrayList;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println("O gato miou!");
    }
}