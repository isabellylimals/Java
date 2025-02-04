/*
  
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
 
Se o ponto estiver na origem, escreva a mensagem “Origem”. 
 
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
situação. 
 */
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro valor da coordenada (x): ");
        int valorx = sc.nextInt();

        System.out.print("Informe o segundo valor da coordenada (y): ");
        int valory = sc.nextInt();

        if (valorx == 0 && valory == 0) {
            System.out.println("A coordenada está na origem.");
        } else if (valorx > 0 && valory > 0) {
            System.out.println("A coordenada está no 1º quadrante.");
        } else if (valorx < 0 && valory > 0) {
            System.out.println("A coordenada está no 2º quadrante.");
        } else if (valorx < 0 && valory < 0) {
            System.out.println("A coordenada está no 3º quadrante.");
        } else if (valorx > 0 && valory < 0) {
            System.out.println("A coordenada está no 4º quadrante.");
        } else if (valorx == 0) {
            System.out.println("A coordenada está sobre o eixo Y.");
        } else if (valory == 0) {
            System.out.println("A coordenada está sobre o eixo X.");
        }

        sc.close();
    }
}
