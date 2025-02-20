package enumm;
public class Composiçao{
    public static void main(String[] args) {
    Endereco lugar= new Endereco("Rua dos Alfenereiros", 4, "Londres");
    Pessoa pessoa= new Pessoa( "Maria", lugar);
    pessoa.Exibirinfo();
    }
}
class Endereco{
    String rua;
    int numero;
    String cidade;

    public Endereco(String rua, int numero, String cidade){
        this.rua=rua;
        this.numero=numero;
        this.cidade=cidade;
    }
}
class Pessoa{
    String nome;
    Endereco endereco;
    public Pessoa(String nome, Endereco endereco){
        this.nome=nome;
        this.endereco=endereco;
    }
    public void Exibirinfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço:");
        System.out.println("  Rua: " + endereco.rua);
        System.out.println("  Número: " + endereco.numero);
        System.out.println("  Cidade: " + endereco.cidade);
    }
    
}
