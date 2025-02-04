/*
  
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. 
 
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. 
 
 
 
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
duas casas decimais.
 */

 import java.util.Scanner;

 public class ex13 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         System.out.println("Bem-vindo ao cálculo de Imposto de Lisarb.");
         System.out.print("Informe seu salário para que possamos analisar o imposto: ");
         double salario = sc.nextDouble();
         double imposto = 0.0;
 
         if (salario <= 2000.00) {
             System.out.println("Você está isento de pagar imposto.");
         } else {
             if (salario > 2000.00) {
                 double faixa1 = Math.min(salario - 2000.00, 1000.00);
                 imposto += (faixa1 * 8) / 100;
             }
             if (salario > 3000.00) {
                 double faixa2 = Math.min(salario - 3000.00, 1500.00);
                 imposto += (faixa2 * 18) / 100;
             }
             if (salario > 4500.00) {
                 double faixa3 = salario - 4500.00;
                 imposto += (faixa3 * 28) / 100;
             }
             System.out.printf("Você vai pagar: R$ %.2f de imposto%n", imposto);
         }
 
         sc.close();
     }
 }
 