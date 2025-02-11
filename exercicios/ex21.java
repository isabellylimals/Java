
import java.util.Scanner;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. 
Lembrando que, por definição, fatorial de 0 é 1. */

public class ex21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Informe um valor para calcular seu fatorial:\n");
        int valor= sc.nextInt();
        int fat;
        for( fat = 1; valor > 1; valor= valor- 1){
        fat = fat * valor;}
        System.out.printf("Fatorial de: %d é : %d\n",valor, fat);
        sc.close();
    }
}
