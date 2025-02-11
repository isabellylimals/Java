/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".  */

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de pares de números: ");
        int valor = sc.nextInt();

        for (int i = 0; i < valor; i++) {
            System.out.print("Agora informe um número: ");
            int num1 = sc.nextInt();
            System.out.print("Agora informe outro número: ");
            int num2 = sc.nextInt();

            if (num2 == 0) {
                System.out.println("Divisão impossível\n");
            } else if (num1 % num2 == 0) {
                int divisao = num1 / num2;
                System.out.printf("Divisão possível: %d\n", divisao);
            } else {
                System.out.println("Divisão impossível\n");
            }
        }
        sc.close();
    }
}

