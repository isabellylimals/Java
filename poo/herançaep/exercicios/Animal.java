/*Requisitos:
Crie uma classe base chamada Animal com os seguintes atributos e métodos:

String nome
void emitirSom(): imprime "O animal emitiu um som."
Crie duas subclasses:

Cachorro: sobrescreve emitirSom() para imprimir "O cachorro latiu!"
Gato: sobrescreve emitirSom() para imprimir "O gato miou!"
No main(), crie um vetor de Animal e adicione um Cachorro e um Gato.

Percorra o vetor e chame emitirSom() para cada animal. */

package exercicios;

public class Animal {
    private String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    void emitirSom() {
        System.out.println("O animal emitiu um som");
    }
}