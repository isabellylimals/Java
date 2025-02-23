
package arquivos.Produtos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ProdutosdeLimpeza {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        ArquivoProdutos produtos = new ArquivoProdutos();
        produtos.lerProdutosDoArquivo("produtos.txt");
        while (true) { 
            System.out.println("=====CADASTRO DE PRODUTOS=====");
            System.out.println("[1] Adicionar novo produto ao arquivo");
            System.out.println("[2] Listar produtos presentes no arquivo");
            System.out.println("[3] Buscar produtos");
            System.out.println("[4] Sair do Programa");
            System.out.print("Escolha uma das opções acima:\n");
            int choice= sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 : System.out.print("ID do produto:\n");
                int id = sc.nextInt();
                sc.nextLine();
        
                System.out.print("Nome do produto:\n");
                String nome = sc.nextLine();
        
                System.out.print("Preço do produto:\n");
                double preco = sc.nextDouble();
        
                Produto pro = new Produto(id, nome, preco);
                produtos.Adicionarproduto("produtos.txt", pro);
                produtos.lerProdutosDoArquivo("produtos.txt");
                    break;
                    case 2:
                    System.out.println("Lista de produtos:");
                    produtos.lerProdutosDoArquivo("produtos.txt");
                    break;
                    case 3 :
                            System.out.print("Digite o id do produto que deseja buscar:\n");
                            int IDprocurar= sc.nextInt();
                            produtos.buscarProdutos("produtos.txt", IDprocurar);
                    break;
                    case 4 :
                    System.out.println("Saindo do programa...");
                    sc.close();
                    return;
                   
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
       
    }
    
}

class Produto {
    int id;
    String nome;
    double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}

class ArquivoProdutos {
   
    public void Adicionarproduto(String nomearq, Produto produto) {
        try (FileWriter arquivo = new FileWriter(nomearq, true)) {
            String dados = produto.id + "," + produto.nome + "," + produto.preco + ",";
            arquivo.write(dados);
            System.out.println("Produto adicionado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public void lerProdutosDoArquivo(String nomeArquivo) {
      
        try (BufferedReader ler = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = ler.readLine()) != null) {
                
                String[] dados = linha.split(","); 
                int id = Integer.parseInt(dados[0].trim());
                String nome = dados[1].trim();
                double preco = Double.parseDouble(dados[2].trim());
    
                
                System.out.println("ID: " + id + ", Nome: " + nome + ", Preço: " + preco);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter os dados do arquivo: " + e.getMessage());
        }
    }
    
    public void buscarProdutos(String nomeArquivo, int IDprocurar) {
        try (BufferedReader ler = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            
    
            while ((linha = ler.readLine()) != null) {
                String[] dados = linha.split(",");
                int id = Integer.parseInt(dados[0].trim());
                String nome = dados[1].trim();
                double preco = Double.parseDouble(dados[2].trim());
    
                if (id == IDprocurar) {
                    System.out.println("Produto encontrado!");
                    System.out.println("ID: " + id + ", Nome: " + nome + ", Preço: " + preco);
                    
                    break; 
                }else{
                    System.out.println("Produto com ID " + IDprocurar + " não encontrado.");
            }
                
            }
    
    
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo para busca: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter os dados do arquivo: " + e.getMessage());
        }
    }
    
}
