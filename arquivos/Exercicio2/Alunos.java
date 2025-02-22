package arquivos.Exercicio2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Alunos {
    public static void main(String[] args) {
        ArquivoAlunos arq = new ArquivoAlunos();

      
        arq.lerAlunosDoArquivo("alunos.txt");
    }
}

class Aluno {
    String nome;
    double nota1, nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
}

class ArquivoAlunos {
  
    public void salvarAlunoNoArquivo(String nomeArquivo, Aluno aluno) {
        File verificar = new File(nomeArquivo);
        if (verificar.exists()) {
            System.out.println("O arquivo já existe\n");
        } else {
            try (FileWriter escrever = new FileWriter(nomeArquivo, true)) {
                String dados = aluno.nome + "," + aluno.nota1 + "," + aluno.nota2 + "\n";
                escrever.write(dados);
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        }
    }

    public void lerAlunosDoArquivo(String nomeArquivo) {
        int qtdpalavras = 0;
        try (BufferedReader ler = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                // Divide a linha em partes usando a vírgula como separador
                String[] dados = linha.split(","); // Faz com que a string vire um array de palavras, a vírgula é usada como parâmetro para separar
                qtdpalavras += dados.length;
                String nome = dados[0];
                double nota1 = Double.parseDouble(dados[1]);
                double nota2 = Double.parseDouble(dados[2]);
                System.out.println("Nome: " + nome + ", Nota1: " + nota1 + ", Nota2: " + nota2 + ", Quantidade de palavras: " + qtdpalavras);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
