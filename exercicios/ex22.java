//ler um número inteiro N e calcular todos os seus divisores. 
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Informe um numero qualquer:\n");
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            if(n%i==0){
                System.out.printf("%d é divisor de %d\n", i, n);
            }
        }
        sc.close();
    }
}
