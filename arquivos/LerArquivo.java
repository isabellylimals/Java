/*Explicação
FileReader abre o arquivo.
BufferedReader lê o arquivo linha por linha (eficiente).
O while percorre todo o conteúdo e imprime no console.
 */

package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("meuarquivo.txt"));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }
}
