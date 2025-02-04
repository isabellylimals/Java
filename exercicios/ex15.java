/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorx, valory;

        do {
            System.out.print("Informe o primeiro valor da coordenada (x): ");
            valorx = sc.nextInt();

            System.out.print("Informe o segundo valor da coordenada (y): ");
            valory = sc.nextInt();

            if (valorx == 0 && valory == 0) {
                System.out.println("A coordenada está na origem. Programa encerrado.");
                break; // Encerra o loop ao digitar (0,0)
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

        } while (true); 

        sc.close();
    }
}

