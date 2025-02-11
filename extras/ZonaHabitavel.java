package extras;
//Simulação de vida nas estrelas!!
import java.util.Scanner;

public class ZonaHabitavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Qual a distância do planeta da sua estrela (em UA)? ");
        float distancia = sc.nextFloat();

        System.out.print("Qual o tipo da estrela (O, B, A, F, G, K, M)? ");
        char tipoEstrela = sc.next().toUpperCase().charAt(0);

        sc.close();

        // Intervalos da Zona Habitável (em UA)
        float limiteInferior = 0, limiteSuperior = 0;
        
        switch (tipoEstrela) {
            case 'O': limiteInferior = 5.0f; limiteSuperior = 50.0f; break;
            case 'B': limiteInferior = 1.5f; limiteSuperior = 10.0f; break;
            case 'A': limiteInferior = 0.8f; limiteSuperior = 3.0f; break;
            case 'F': limiteInferior = 0.5f; limiteSuperior = 2.0f; break;
            case 'G': limiteInferior = 0.8f; limiteSuperior = 1.5f; break; // Exemplo: Sol
            case 'K': limiteInferior = 0.4f; limiteSuperior = 0.9f; break;
            case 'M': limiteInferior = 0.1f; limiteSuperior = 0.4f; break; // Exemplo: Anã Vermelha
            default:
                System.out.println("Tipo de estrela inválido! Use O, B, A, F, G, K ou M.");
                return;
        }

        if (distancia >= limiteInferior && distancia <= limiteSuperior) {
            System.out.println("🌍 O planeta está na zona habitável! Pode ter água líquida!");
        } else if (distancia < limiteInferior) {
            System.out.println("🔥 O planeta está muito perto da estrela! Muito quente!");
        } else {
            System.out.println("❄️ O planeta está muito longe da estrela! Muito frio!");
        }
    }
}
