// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//decimais. 

import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
 System.out.print("Digite o numero do funcionario:");
 int num= sc.nextInt();
System.out.print("Agora informe o numero de horas trabalhadas:");
 int horas= sc.nextInt();
System.out.print("Agora informe o valor que ele recebe por hora:");
double valor= sc.nextDouble();
double salario= (double)horas*valor;
System.out.printf("O salario do funcionario %d é de: %.2f\n", num, salario);

sc.close();
    }
}
