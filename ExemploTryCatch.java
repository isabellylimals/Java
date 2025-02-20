public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int resultado = a / b; // Pode gerar exceção
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida!");
        }
        System.out.println("O programa continua funcionando...");
    }
}
