
/*ConjuntoPares:
Armazena apenas números pares.
Implementa os métodos para calcular média, maior e menor número.
ConjuntoImpares:
Armazena apenas números ímpares.
Também implementa os métodos de estatística.
Na Main, permitir que o usuário adicione números

O número deve ser armazenado no ConjuntoPares se for par e no ConjuntoImpares se for ímpar.
Após a entrada dos números, exibir as estatísticas de cada conjunto.
 */
/* */
package conjuntosnumericos;


public class ConjuntosPares extends ConjuntosNumericos {
    public ConjuntosPares() {
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
            System.out.println("Maior número par: " + maior);
    }
@Override
    public void encontrarMenor() {
        int menor = Integer.MAX_VALUE;

        for (int numero : getNumeros()) {
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Menor número par: " + menor);
    }
}
