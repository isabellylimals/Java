package conjuntosnumericos;

public class ConjuntosImpares extends ConjuntosNumericos {
    public ConjuntosImpares() {
        super();
    }

    @Override
    public double calcularMedia() {
        int soma = 0, contador = 0;

        for (int numero : getNumeros()) {
            soma += numero;
            contador++;
        }

        return (contador == 0) ? 0 : (double) soma / contador;
    }

    @Override
    public void encontrarMaior() {
        int maior = Integer.MIN_VALUE;

        for (int numero : getNumeros()) {
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior número ímpar: " + maior);
    }

    @Override
    public void encontrarMenor() {
        int menor = Integer.MAX_VALUE;

        for (int numero : getNumeros()) {
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Menor número ímpar: " + menor);
    }
}
