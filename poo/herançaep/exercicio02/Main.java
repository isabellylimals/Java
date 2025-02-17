/*Exercício:
Crie uma hierarquia de classes para representar formas geométricas. A classe base será Forma, com métodos para calcular a área e o perímetro. As classes derivadas serão Circulo e Retangulo, que irão sobrescrever os métodos de cálculo de área e perímetro. Em seguida, armazene as formas em um ArrayList e calcule e mostre a área e o perímetro de cada forma.

Requisitos:
Crie a classe Forma com os métodos calcularArea() e calcularPerimetro(), que serão sobrescritos pelas classes filhas.
Crie as classes Circulo e Retangulo, que herdam de Forma e implementam os métodos de cálculo de área e perímetro.
Utilize um ArrayList<Forma> para armazenar as formas e, em seguida, calcule e mostre a área e o perímetro de cada uma, demonstrando o uso de polimorfismo. */
package exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Forma forma = null; // Criamos um objeto do tipo Forma para polimorfismo

        System.out.print("Área e Perímetro: Circulo[1] ou Retangulo[2]? ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.print("Informe o raio do Círculo: ");
            double raio = sc.nextDouble();
            forma = new Circulo(raio);
        } else if (escolha == 2) {
            System.out.print("Informe a largura do Retângulo: ");
            double largura = sc.nextDouble();
            System.out.print("Informe a altura do Retângulo: ");
            double altura = sc.nextDouble();
            forma = new Retangulo(largura, altura);
        } else {
            System.out.println("Opção inválida!");
        }

        if (forma != null) {
            System.out.println("Área: " + String.format("%.4f", forma.calcularArea()));
            System.out.println("Perímetro: " + String.format("%.4f", forma.calcularPerimetro()));

        }

        sc.close();
    }
}
