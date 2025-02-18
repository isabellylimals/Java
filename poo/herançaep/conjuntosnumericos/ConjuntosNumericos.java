
/*Requisitos da Atividade
Criar uma classe abstrata ConjuntoNumerico

Deve ter um vetor (ArrayList<Integer>) para armazenar os números.
Deve ter métodos abstratos calcularMedia(), encontrarMaior() e encontrarMenor().
Criar duas classes concretas que herdam de ConjuntoNumerico

ConjuntoPares:
Armazena apenas números pares.
Implementa os métodos para calcular média, maior e menor número.
ConjuntoImpares:
Armazena apenas números ímpares.
Também implementa os métodos de estatística.
Na Main, permitir que o usuário adicione números

O número deve ser armazenado no ConjuntoPares se for par e no ConjuntoImpares se for ímpar.
Após a entrada dos números, exibir as estatísticas de cada conjunto.
 */

package conjuntosnumericos;
import java.util.ArrayList;
import java.util.List;

public class ConjuntosNumericos {
    protected List<Integer> numeros;

    public ConjuntosNumericos() {
        this.numeros = new ArrayList<>();
    }

   

    public List<Integer> getNumeros() {
        return numeros;
    }

    public double calcularMedia() {
        return 0; 
    }
}