package conjuntosnumericos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConjuntosPares pares = new ConjuntosPares();
        ConjuntosImpares impares = new ConjuntosImpares();

    

        while (true) {
            System.out.print("Adicione um número:\n");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares.adicionarNumero(numero);
            } else {
                impares.adicionarNumero(numero);
            }

            System.out.print("Deseja adicionar mais números? [1] Sim [2] Não\n");
            int escolha = sc.nextInt();
            if (escolha == 2) {
                break;
            }
        }

        System.out.println("\nEstatísticas dos números pares:");
        System.out.println("Média: " + pares.calcularMedia());
        pares.encontrarMaior();
        pares.encontrarMenor();

        System.out.println("\nEstatísticas dos números ímpares:");
        System.out.println("Média: " + impares.calcularMedia());
        impares.encontrarMaior();
        impares.encontrarMenor();

        sc.close();
    }
}
