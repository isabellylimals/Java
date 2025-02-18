
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
        int soma = 0;
        int contador = 0;

        for (int numero : getNumeros()) {
            if (numero % 2 == 0) { 
                
                soma += numero;
                contador++;
            }
        }

        if (contador == 0) {
            return 0; 
        }

        return (double) soma / contador; 
    }
    @Override
    public int encontrarMaior(){
        int maior= 0;
        for(int numero: getNumeros()){
            if(numero%2==0){
                if(numero>maior){
                    maior=numero;
                }
            }
        }
        System.out.println("Maior numero dos pares:");
        return maior;
    }

    @Override
    public int encontrarMenor(){
        int menor= 1000;
        for(int numero: getNumeros()){
            if(numero%2==0){
                if(numero>menor){
                    menor=numero;
                }
            }
        }
        System.out.println("Maior numero dos pares:");
        return menor;
    }
}