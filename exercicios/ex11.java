import java.util.Scanner;

/**
  
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. 
 */
public class ex11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Informe um valor qualquer.");
        int valor= sc.nextInt();
        if(valor>= 0 && valor<=25){
            System.out.println("O valor informado esta no intervalo: [0,25]");
        }else if (valor>25 && valor<=50) {
            System.out.println("O valor informado esta no intervalo:[26,50]");
            
        }else if (valor>50 && valor<=75) {
            System.out.println("O valor informado esta no intervalo:[51,75]");
            
        } else if(valor>75 && valor<=100){
            System.out.println("O valor informado esta no intervalo:[76,100]");
        } else{
            System.out.println("O valor informado esta fora dos intervalos");
        }


        sc.close();
    }
}
