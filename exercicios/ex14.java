import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Informe a nova senha: ");
        int senha = sc.nextInt();

        System.out.println("Cadastro concluído.");
        

        int entrada;
        do {
            System.out.print("Informe a senha: ");
            entrada = sc.nextInt();
            
            if (entrada != senha) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        } while (entrada != senha);

        System.out.println("Acesso permitido!");

        sc.close();
    }
}
