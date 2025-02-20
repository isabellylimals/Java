package enumm;
enum DiaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana hoje = DiaSemana.QUARTA;

        System.out.println("Hoje é: " + hoje);

        
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println("Dia: " + dia);
        }
    }
}
