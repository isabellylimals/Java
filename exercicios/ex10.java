import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Informe a hora que o jogo vai começar (formato 24h, ex: 14 para 14h ou 23 para 23h): ");
        int horaInicial = sc.nextInt();

        System.out.print("Informe a hora que o jogo vai terminar (formato 24h, ex: 14 para 14h ou 23 para 23h): ");
        int horaFinal = sc.nextInt();

        if (horaInicial < 0 || horaInicial > 23 || horaFinal < 0 || horaFinal > 23) {
            System.out.println("Horas inválidas! Use valores entre 0 e 23.");
        } else {
            
            int duracao;
            if (horaFinal >= horaInicial) {
                duracao = horaFinal - horaInicial; 
            } else {
                duracao = 24 - horaInicial + horaFinal; 
            }

       
            if (duracao < 1) {
                System.out.println("O jogo deve durar pelo menos 1 hora.");
            } else {
                System.out.println("A duração do jogo foi de " + duracao + " hora(s).");
            }
        }

        sc.close();
    }
}

