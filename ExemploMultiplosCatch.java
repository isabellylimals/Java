public class ExemploMultiplosCatch {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // tenta acessar o conteudo de um indice acima
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido!");
        } catch (Exception e) {
            System.out.println("Erro genérico: " + e.getMessage());
        }
    }
}
