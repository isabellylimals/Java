
import java.util.Scanner;

/* Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado */

public class ex24 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.print("Informe a altura do retângulo: ");
        r.altura = sc.nextDouble();

        System.out.print("Informe a largura do retângulo: ");
        r.largura = sc.nextDouble();

        System.out.println("Área do retângulo: " + r.area());
        System.out.println("Perímetro do retângulo: " + r.perimetro());
        System.out.println("Diagonal do retângulo: " + r.diagonal());

        sc.close(); 
    }
}

class Retangulo {
    double largura;
    double altura;

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }

    public double diagonal() {
        return Math.sqrt(altura * altura + largura * largura);
    }
}
