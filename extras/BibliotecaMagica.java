/*Criar uma classe LivroMagico com os seguintes atributos:

titulo (String) → Nome do livro.
autor (String) → Nome do autor.
poderMagico (String) → Descreve o poder especial do livro (exemplo: "Cura feridas", "Controla o tempo", "Invoca criaturas").
nivelMagia (int) → Um número de 1 a 10 que representa a força da magia contida no livro.
Criar um método usarMagia(), que exibe uma mensagem dizendo qual poder foi ativado.

Criar uma classe BibliotecaMagica para armazenar e gerenciar os livros. Ela deve permitir:

Adicionar um novo livro.
Exibir todos os livros disponíveis na biblioteca.
Buscar um livro pelo título e ativar sua magia. */
package extras;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaMagica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BibliotecaMagica biblioteca = new BibliotecaMagica();
        int limite = 0;

        while (true) { // Loop para o menu
            System.out.println("\nBem vindo a Biblioteca Mágica!!");
            System.out.print("[1] Adicionar um novo Livro\n[2] Exibir todos os livros disponiveis\n[3] Buscar um livro\n[4] Ativar Magia\n[5] Sair\n");
            System.out.print("Escolha uma opção: ");
            int choice = sc.nextInt();
    

            switch (choice) {
                case 1: 
                    
                    System.out.print("Informe o nome do livro:\n");
                    String nome = sc.nextLine();
                    System.out.print("Informe o autor:\n");
                    String autor = sc.nextLine();
                    System.out.print("Informe o poder do livro:\n");
                    String poder = sc.nextLine();
                    System.out.print("Qual o poder do livro [1 a 10]:\n");
                    int nivelMagia = sc.nextInt();
                    sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()
                    biblioteca.adicionarLivro(new LivroMagico(nome, autor, poder, nivelMagia));
                    limite = limite + 1;
                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:
                    System.out.print("Digite o nome do livro que deseja encontrar:\n");
                    String nomeBusca = sc.nextLine();
                    biblioteca.buscarLivro(nomeBusca);
                    break;

                case 4:
                    System.out.print("Digite o nome do livro para ativar a magia:\n");
                    String nomeAtivar = sc.nextLine();
                    biblioteca.ativarMagia(nomeAtivar);
                    break;

                case 5:
                    System.out.println("Saindo da Biblioteca Mágica...");
                    sc.close();
                    return; 

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private ArrayList<LivroMagico> livros = new ArrayList<>();

    public void adicionarLivro(LivroMagico livro) {
        livros.add(livro);
        System.out.println("Livro adicionado à biblioteca!");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca!");
        } else {
            System.out.println("\nLista de Livros Mágicos:");
            for (int i = 0; i < livros.size(); i++) {
                System.out.println(livros.get(i).getInfo());
            }
        }
    }

    public void buscarLivro(String nome) {
        for (LivroMagico livro : livros) {
            if (livro.nome.equalsIgnoreCase(nome)) {
                System.out.println("Livro encontrado: " + livro.getInfo());
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public void ativarMagia(String nome) {
        for (LivroMagico livro : livros) {
            if (livro.nome.equalsIgnoreCase(nome)) {
                livro.Ativarmagia();
                return;
            }
        }
        System.out.println("Livro não encontrado para ativar a magia!");
    }
}

class LivroMagico {
    String nome;
    String autor;
    String poder;
    int nivelMagia;

    public LivroMagico(String nome, String autor, String poder, int nivelMagia) {
        this.nome = nome;
        this.autor = autor;
        this.poder = poder;
        this.nivelMagia = nivelMagia;
    }

    public void Ativarmagia() {
        System.out.printf("O livro: %s de %s teve seu poder %s ativado, seu nivel de magia é de : %d\n!!", this.nome, this.autor, this.poder, this.nivelMagia);
    }

    public String getInfo() {
        return "Título: " + nome + ", Autor: " + autor + ", Poder: " + poder + ", Nivel de magia: " + nivelMagia;
    }
}