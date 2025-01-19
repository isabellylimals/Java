//package firstpratic;

import java.util.Scanner;


public class main4 {
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        String x;
        double w;
        int y;
        char a;
        
        a= sc.next().charAt(0);
        w=sc.nextDouble();
        x=sc.next();
        y=sc.nextInt();
        System.out.println("voce digitou"+y);
        System.out.println("Voce digitou: "+x);
        System.out.println("voce digitou"+w);
        System.out.println("dwdw" +a);
        System.out.println(".(dados digitados)");
        System.out.println(x);
        System.err.println(y);
        System.out.println(w);




        sc.close();
    }
}
