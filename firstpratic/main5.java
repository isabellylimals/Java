import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        int x;

        // Lê o número inteiro
        x = sc.nextInt();
        sc.nextLine(); // Consome o '\n' após o número

        // Lê as três linhas seguintes
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        // Exibe os dados digitados
        System.out.println(".(dados digitados)");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close(); // Fecha o Scanner
    }
}
