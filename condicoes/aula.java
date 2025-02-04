package condicoes;
//teste de software, codigo fornecido em parte pelo professor, e o resto feito po IA

import java.util.Scanner;

public class aula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

      
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the value to find: ");
        int value = sc.nextInt();

        aula obj = new aula();
        int lastIndex = obj.findLast(array, value);

      
        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + value + ": " + lastIndex);
        } else {
            System.out.println(value + " not found in the array.");
        }

        sc.close();
    }

    public int findLast(int[] x, int y) { 
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == y) { 
                return i; 
            } 
        } 
        return -1; 
    } 
}
