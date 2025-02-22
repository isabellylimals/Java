/*Modifique a classe ArquivoTexto e adicione um método que lê o conteúdo de um arquivo e exibe na tela.

💡 Dicas:

Use BufferedReader para ler o arquivo linha por linha.
Se o arquivo não existir, trate a exceção adequadamente.
✅ Objetivo: Permitir a leitura de um  existente. */

package arquivos.Exercicio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class programa {
    public static void main(String[] args) {
        ArquivoTexto arq = new ArquivoTexto();
        arq.escreverTexto("testando.txt", "Olá mundo\n");
        arq.lertexto();
    }
}

class ArquivoTexto {
    public void escreverTexto(String nomeArquivo, String texto) {
        FileWriter arquivo = null;
        try {
            arquivo = new FileWriter(nomeArquivo);
            arquivo.write(texto);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        } finally {
            if (arquivo != null) {
                try {
                    arquivo.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
                }
            }
        }
    }

    public void lertexto() {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("testando.txt"));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.print(linha);
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
