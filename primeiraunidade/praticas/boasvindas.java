package primeiraunidade.praticas;
import java.util.Scanner;

public class boasvindas {
   

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
       String nome= sc.nextLine();
       System.out.println("Bem vindo(a)!! " + nome );
        sc.close();

    
    }
}

