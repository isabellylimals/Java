package poo.programa;

import java.util.Locale;
import java.util.Scanner;
import poo.classes.Produto;

public class Pratica02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto(); // Importando e alocando memória para os dados

        System.out.println("Entre com um produto:");
        System.out.print("Name:\n");
        produto.nome = sc.nextLine();

        System.out.print("Preço:\n");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade:\n");
        produto.qtd = sc.nextInt();

        System.out.println("Produto dados: " + produto);

        System.out.println("Entre com a quantidade de produtos para adicionar ao estoque:");
        int qtd = sc.nextInt();
        produto.addproduto(qtd);
        System.out.println("Atualização de estoque: " + produto);

        System.out.println("Entre com a quantidade de produtos para remover do estoque:");
        qtd = sc.nextInt(); 
        produto.remover(qtd);
        System.out.println("Atualização de estoque após remoção: " + produto);

        sc.close();
    }
}
