package arquivos;
import java.io.File;

public class DeletarArquivo {
    public static void main(String[] args) {
        File arquivo = new File("meuarquivo.txt");
        if (arquivo.delete()) {
            System.out.println("Arquivo deletado com sucesso.");
        } else {
            System.out.println("Falha ao deletar o arquivo.");
        }
    }
}
