//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). 
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.print("Digite um valor para A:");
    int a= sc.nextInt();
    System.out.print("Digite um valor para B:");
    int b= sc.nextInt();
    System.out.print("Digite um valor para C:");
int c= sc.nextInt();
System.out.print("Digite um valor para D:");
int d= sc.nextInt();
int diferença=(a*b)-(c*d);
System.out.print("A DIFERENÇA É DE:"+diferença);



        sc.close();
    }
}
