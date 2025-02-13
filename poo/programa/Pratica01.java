package poo.programa;

import java.util.Locale;
import java.util.Scanner;
import poo.classes.Triangulo; 

public class Pratica01 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Triangulo x, y;
        x = new Triangulo();//ALOCAÇÃO, varaivel x é referencia para o valor que esta no heap
        y = new Triangulo();

       
        System.out.println("Digite os lados do triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

       
        System.out.println("Digite os lados do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        
        
       double areaX= x.area();
       double areaY= y.area();
        
        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);


        if (areaX > areaY) {
            System.out.println("O triângulo X tem a maior área.");
        } else if (areaY > areaX) {
            System.out.println("O triângulo Y tem a maior área.");
        } else {
            System.out.println("Os triângulos têm áreas iguais.");
        }

        sc.close();
    }
}
