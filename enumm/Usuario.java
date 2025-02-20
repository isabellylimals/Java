
package enumm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Usuarioclasse> usuarios = new ArrayList<>();
        
        for(Nivelacesso info : Nivelacesso.values()){
            System.out.print("Insira o nome do usuário para:\n" + info + " (" + info.getDescription() + "): ");
            String nome = sc.nextLine();
            Usuarioclasse u = new Usuarioclasse(nome, info);
            usuarios.add(u);
        }
        
        System.out.println("\nInformações dos usuários cadastrados:");
        for(Usuarioclasse u : usuarios) {
            u.exibir();
        }
        
        sc.close();
    }
}

enum Nivelacesso {
    ADMIN("Cuida das coisas"),
    MODERADOR("Moderador"),
    USUARIO("Usuário"),
    VISITANTE("Visitante");

    private String descricao;

    Nivelacesso(String descricao) {
        this.descricao = descricao;
    }

    
    public String getDescription() {
        return descricao;
    }
}

class Usuarioclasse {
    String nome;
    Nivelacesso nivel;

    public Usuarioclasse(String nome, Nivelacesso nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void exibir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível de Acesso: " + this.nivel);
        System.out.println("Descrição: " + this.nivel.getDescription());
    }
}
