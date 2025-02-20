package arquivos.Exercicio;
import java.io.FileWriter;
import java.io.IOException;

public class programa {
    public static void main(String[] args) {
        ArquivoTexto arq = new ArquivoTexto();
        arq.escreverTexto("testando.txt", "Olá mundo\n");
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
}
