package enumm;

enum NivelAcesso {
    ADMIN("Administrador"), 
    USER("Usuário Comum"), 
    GUEST("Visitante");

    private String descricao;

    NivelAcesso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

public class TesteEnumAtributo {
    public static void main(String[] args) {
        NivelAcesso nivel = NivelAcesso.ADMIN;

        System.out.println("Nível: " + nivel + " - " + nivel.getDescricao());
    }
}
