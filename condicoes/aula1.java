package condicoes;
public class aula1 {
    public static void main(String[] args) {
        int[] x = {-2, -4,- 8}; // Exemplo de array
        int cont = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i]%2!= 0 || x[i] > 0) {
                cont++;
            }
        }

        System.out.println("Contagem: " + cont);
    }
}
//saida esperada=5