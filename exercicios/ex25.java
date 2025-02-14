/* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
projetada abaixo */
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Informe o nome do funcionário: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Informe o salário bruto do funcionário: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Informe o imposto que ele paga: ");
        funcionario.imposto = sc.nextDouble();

        System.out.print("Deseja aumentar o salário do funcionário? (1 - Sim, 2 - Não): ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.print("Informe a porcentagem de aumento: ");
            int porcentagem = sc.nextInt();
            funcionario.aumento(porcentagem);
            System.out.println("Salário atualizado após aumento: " + funcionario.salarioBruto);
        } else if (escolha == 2) {
            System.out.println("Você escolheu não aumentar o salário.");
        }

        System.out.printf("\nDados do Funcionário: \nNome: %s\nSalário Bruto: %.2f\nImposto: %.2f\nSalário Líquido: %.2f\n",
                funcionario.nome, funcionario.salarioBruto, funcionario.imposto, funcionario.salarioLiquido());

        sc.close();
    }
}

// Classe Funcionario
class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;


    public void aumento(int porcentagem) {
        salarioBruto += (salarioBruto * porcentagem) / 100.0;
    }


    public double salarioLiquido() {
        return salarioBruto - imposto;
    }
}
