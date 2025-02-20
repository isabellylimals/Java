package arquivos;

import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("meuarquivo.txt");
            escritor.write("Olá, mundo!\n");
            escritor.write("Este é um arquivo criado em Java.");
            escritor.close();
            System.out.println("Arquivo criado e texto escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
}
