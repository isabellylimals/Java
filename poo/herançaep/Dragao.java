//Exemplo totalmente feito po IA

/*Explicação do Código
✅ Herança:

Dragao e Fenix herdam de Criatura, reaproveitando atributos e métodos.
super(nome, nivel) chama o construtor da classe base.
✅ Polimorfismo:

Sobrescrita: Fenix redefine o método atacar() com um novo comportamento.
Sobrecarga: Criatura tem múltiplas versões de atacar() para diferentes situações.
✅ Execução no Main:

Criamos e testamos objetos das classes Dragao, Fenix e Criatura.
Demonstramos o uso de herança, sobrescrita e sobrecarga. */
// Superclasse Criatura
// Esta classe contém atributos e métodos comuns a todas as criaturas
public class Criatura {
    protected String nome; // Nome da criatura (acessível pelas subclasses)
    protected int nivel;   // Nível da criatura

    // Construtor da classe Criatura
    public Criatura(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    // Método que exibe informações básicas da criatura
    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Nível: " + nivel);
    }

    // Método que representa um ataque genérico da criatura
    public void atacar() {
        System.out.println(nome + " atacou!");
    }

    // Sobrecarga do método atacar
    public void atacar(String alvo) {
        System.out.println(nome + " atacou " + alvo + "!");
    }

    public void atacar(String alvo, int dano) {
        System.out.println(nome + " atacou " + alvo + " causando " + dano + " de dano!");
    }
}

// Subclasse Dragao que herda de Criatura
public class Dragao extends Criatura {
    private int poderFogo; // Atributo específico da classe Dragao

    // Construtor da classe Dragao
    public Dragao(String nome, int nivel, int poderFogo) {
        super(nome, nivel); // Chama o construtor da superclasse Criatura
        this.poderFogo = poderFogo;
    }

    // Método específico do Dragao para cuspir fogo
    public void cuspirFogo() {
        System.out.println(nome + " cuspiu fogo com poder " + poderFogo + "!");
    }
}

// Subclasse Fenix que herda de Criatura e sobrescreve o método atacar()
public class Fenix extends Criatura {
    public Fenix(String nome, int nivel) {
        super(nome, nivel);
    }

    // Sobrescrevendo o método atacar para um ataque especial da Fênix
    @Override
    public void atacar() {
        System.out.println(nome + " lançou chamas sagradas!");
    }
}

// Classe Principal (Main)
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Dragao
        Dragao draco = new Dragao("Draco", 10, 50);
        
        draco.exibirInfo();  // Método herdado da superclasse Criatura
        draco.atacar();      // Método herdado da superclasse Criatura
        draco.cuspirFogo();  // Método específico da classe Dragao

        System.out.println(); // Separação visual no console

        // Criando um objeto da classe Fenix
        Fenix phoenix = new Fenix("Phoenix", 20);
        
        phoenix.exibirInfo(); // Método herdado de Criatura
        phoenix.atacar();     // Método sobrescrito na classe Fenix

        System.out.println(); // Separação visual no console

        // Testando polimorfismo (criaturas diferentes usando o mesmo método atacar)
        Criatura c1 = new Criatura("Goblin", 3);
        Criatura c2 = new Dragao("Smaug", 15, 80);
        Criatura c3 = new Fenix("Fawkes", 25);

        c1.atacar(); // Goblin atacou!
        c2.atacar(); // Smaug atacou! (herdado de Criatura)
        c3.atacar(); // Fawkes lançou chamas sagradas! (sobrescrita em Fenix)

        System.out.println(); // Separação visual no console

        // Testando polimorfismo por sobrecarga (o mesmo método com diferentes parâmetros)
        Criatura orc = new Criatura("Orc", 5);
        orc.atacar();                  // Orc atacou!
        orc.atacar("Aventureiro");     // Orc atacou Aventureiro!
        orc.atacar("Aventureiro", 20); // Orc atacou Aventureiro causando 20 de dano!
    }
}
