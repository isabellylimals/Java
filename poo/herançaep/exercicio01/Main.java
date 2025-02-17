/*Requisitos:
Crie uma classe base chamada Animal com os seguintes atributos e métodos:

String nome
void emitirSom(): imprime "O animal emitiu um som."
Crie duas subclasses:

Cachorro: sobrescreve emitirSom() para imprimir "O cachorro latiu!"
Gato: sobrescreve emitirSom() para imprimir "O gato miou!"
No main(), crie um vetor de Animal e adicione um Cachorro e um Gato.

Percorra o vetor e chame emitirSom() para cada animal. */

package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vetores de tamanho fixo
        Cachorro[] cachorros = new Cachorro[2];
        Gato[] gatos = new Gato[2];

        
        for (int i = 0; i < cachorros.length; i++) {
            System.out.print("Insira o nome do cachorro " + (i + 1) + ": ");
            String nome = sc.nextLine();
            cachorros[i] = new Cachorro(nome);
        }

   
        for (int i = 0; i < gatos.length; i++) {
            System.out.print("Insira o nome do gato " + (i + 1) + ": ");
            String nome = sc.nextLine();
            gatos[i] = new Gato(nome);
        }

        System.out.println("\nCachorros emitindo som:");
        for (Cachorro c : cachorros) {
            c.emitirSom();
        }

        System.out.println("\nGatos emitindo som:");
        for (Gato g : gatos) {
            g.emitirSom();
        }

        sc.close();
    }
}
