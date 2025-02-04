/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente. */
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Informe o primeiro valor");
        int valor= sc.nextInt();
        System.out.print("Informe o segundo valor");
        int valor2=sc.nextInt();
        if(valor%valor2==0){
            System.out.println("É multiplo");
        }else{
            System.out.println("Não é multiplo");
        }

        sc.close();
    }
}
