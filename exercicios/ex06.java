/* 
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (pi = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B.  */
import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Informe um valor para A:");
        double a= sc.nextDouble();
        System.out.print("Informe um valor para B:");
        double b=sc.nextDouble();
        System.out.print("Informe um valor para C:");
        double c=   sc.nextDouble();
        double aretriangulo= (a*c)/2;
        double areacirulo= Math.PI*Math.pow(c, 2);
        double areatrapezio= ((a+b)*c)/2;
        double arequadrado= Math.pow(b, b);
        double arearetangulo= a*b;
        System.out.printf("As areas são de : \n Triangulo: %2f\n Circulo : %2f\n Trapezio: %2f\n Quadrado %2f\n Retangulo: %2f ", aretriangulo, areacirulo, areatrapezio, arequadrado,arearetangulo);
        sc.close();
    }
    
}
