/*/*Criar uma classe abstrata Funcionario com métodos para calcular salário e exibir informações.
Criar duas classes derivadas: FuncionarioHorista (pago por hora) e FuncionarioMensalista (salário fixo).
Criar uma ArrayList<Funcionario> na Main para armazenar os funcionários.
Percorrer a lista e exibir os detalhes de cada funcionári */  

package ex03;

public class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}
