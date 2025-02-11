

/* 
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo) */
import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de valores a serem lidos: ");
        int N = sc.nextInt();
        
        int contIn = 0;
        int contOut = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt(); 
            
            if (x >= 10 && x <= 20) {
                contIn++;
            } else {
                contOut++;
            }
        }
        
        System.out.printf("%d in\n", contIn);
        System.out.printf("%d out\n", contOut);
        
        sc.close();
    }
}
