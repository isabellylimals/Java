//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//mensagem explicativa, conforme exemplos. 
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite um numero");
        int num= sc.nextInt();
        System.out.print("Digte o segundo numero;");
        int num2= sc.nextInt();
        int soma= num+num2;
        System.out.print("A soma dos dois numeros é de: "+soma);

        sc.close();
    }
    
}
