import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

     
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        
        double media = (nota1 + nota2 + nota3) / 3;

      
        System.out.println("Notas fornecidas:");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("A média foi: " + media);

        sc.close(); 
    }
}
