/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5. */
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor para o número de testes:\n");
        int qtd = sc.nextInt();

        float media;
        float valor[] = new float[3]; 

        for (int i = 0; i < qtd; i++) {
            System.out.println("Teste " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Informe um valor real:\n");
                valor[j] = sc.nextFloat();
            }

            
            media = ((valor[0] * 2) + (valor[1] * 3) + (valor[2] * 5)) / 10;

          
            System.out.printf("A média foi de: %.2f\n", media);
        }

        sc.close();
    }
}
