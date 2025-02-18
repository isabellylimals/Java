/*/*Criar uma classe abstrata Funcionario com métodos para calcular salário e exibir informações.
Criar duas classes derivadas: FuncionarioHorista (pago por hora) e FuncionarioMensalista (salário fixo).
Criar uma ArrayList<Funcionario> na Main para armazenar os funcionários.
Percorrer a lista e exibir os detalhes de cada funcionári */  

package ex03;

public abstract  class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public void exibirInfo() {
        System.out.printf("Nome: %s | Salário: R$ %.2f%n", nome, calcularSalario());
    }

}
