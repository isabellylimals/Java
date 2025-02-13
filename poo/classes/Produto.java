package poo.classes;

public class Produto {
    public String nome;
    public double preco;
    public int qtd;

    public double totalvalorestoque() {
        return preco * qtd;
    }

    public void addproduto(int qtd) {
        this.qtd += qtd;
    }

    public void remover(int qtd) {
        this.qtd -= qtd;
    }

    public String toString() {
        return nome + ", $" + String.format("%.2f", preco) + ", " + qtd + " units, Total: $" + totalvalorestoque();
    }
}
