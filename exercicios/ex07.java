import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.print("Digite um valor:");
      int valor= sc.nextInt();
      if(valor<1 && valor != 0){
     System.out.println("O valor inserido é negativo");

      }
      else{
        System.out.print("O valor é positivo");
      }


        sc.close();

    }
    
}
