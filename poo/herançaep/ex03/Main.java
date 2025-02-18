package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.print("Cadastro de Funcionario\n[1] Cadastrar Funcionario Honorista\n[2] Cadastrar Funcionario Mensalista\n[3] Sair\nEscolha uma opção: ");
            int escolha = sc.nextInt();
            sc.nextLine(); 

            if (escolha == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Valor da hora: ");
                double valorHora = sc.nextDouble();
                System.out.print("Horas Trabalhadas: ");
                int horasTrabalhadas = sc.nextInt();
                sc.nextLine(); 

                funcionarios.add(new FuncionarioHorista(nome, valorHora, horasTrabalhadas));
                System.out.println("Funcionário Horista cadastrado com sucesso!\n");
            } 
            else if (escolha == 2) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Salario: ");
                double salario = sc.nextDouble();
                sc.nextLine(); 
                funcionarios.add(new FuncionarioMensalista(nome, salario));
                System.out.println("Funcionário Mensalista cadastrado com sucesso!\n");
            } 
            else if (escolha == 3) {
                for (Funcionario f : funcionarios) {
                    System.out.println("Funcionarios:");
                    f.exibirInfo(); 
                    System.out.println(); 
                }
                break; 
            } 
            else {
                System.out.println("Opção inválida. Tente novamente.\n");
            }
        }

        sc.close();
    }
}