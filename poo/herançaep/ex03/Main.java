package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        while (true) { 
            System.out.print("Cadastro de Funcionario\n [1]Cadastrar Funcionario Honorista\n[2]Cadastrar Funcionario Mensalista\n[3] Sair");
            int escolha= sc.nextInt();
            if(escolha==1){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Valor da hora: \n");
                double valorhora= sc.nextDouble();
                System.out.print("Horas Trabalhadas:\n");
                int horas= sc.nextInt();
                funcionarios.add(new FuncionarioHorista(nome, valorhora, horas));


            }
        }
        sc.close();
    }
}
