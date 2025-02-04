/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso.  */

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um valor inteiro: ");
        int valor = sc.nextInt();

        System.out.println("Números ímpares de 1 até " + valor + ":");
        for (int i = 1; i <= valor; i++) {
            if (i % 2 != 0) { 
                System.out.printf("%d\n", i); 
            }
        }

        sc.close();
    }
}
