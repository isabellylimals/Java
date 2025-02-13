/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo */

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Informe um valor:\n");
        int valor= sc.nextInt();
        for(int i=1;i<=valor;i++){
            System.out.printf("Linha: %d\n",i);
            System.out.printf("Quadrado:%d\nCubo:%d\n", i*i, i*i*i);
        }

        sc.close();
    }
}
