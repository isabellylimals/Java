//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite um valor");
        int valor= sc.nextInt();
        if(valor%2==0){
            System.out.println("Esse valor é par.");
        }
        else{
            System.out.println("Esse valor é impar");
        }
        sc.close();
    }
}
