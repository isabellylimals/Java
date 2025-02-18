
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
}