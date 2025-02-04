/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.  */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.print("Informe o codido da peça 1:");
      int codigo1= sc.nextInt();
System.out.print("Informe a quantidade que deseja comprar:");
int qtd= sc.nextInt();
      System.out.print("Infome o seu valor unitario:");
      double valoru= sc.nextDouble();
      System.out.print("Informe o codigo da peça 2:");
      int codigo2= sc.nextInt();
      System.out.print("Informe a quantidade que deseja comprar:");
int qtd2= sc.nextInt();
      System.out.print("Infome seu valor unitario:");
      double valoru2= sc.nextDouble();
        sc.close();
double valorpago1= (int)qtd*valoru;
double valorpago2= (int)qtd2*valoru2;
System.out.printf("O valor a ser paggo pela peça 1, de codigo: %d é de: %.2f\n", codigo1, valorpago1);
System.out.printf("O valor a ser paggo pela peça 2, de codigo: %d é de: %.2f\n", codigo2, valorpago2);
    }
}
