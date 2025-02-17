package exercicio01;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println("O cachorro latiu!!!");
    }
}