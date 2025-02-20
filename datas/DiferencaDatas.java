package datas;

import java.time.LocalDate;
import java.time.Period;

public class DiferencaDatas {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(2000, 5, 15);
        LocalDate hoje = LocalDate.now();

        Period periodo = Period.between(dataNascimento, hoje);

        System.out.println("Idade: " + periodo.getYears() + " anos, " + 
                           periodo.getMonths() + " meses e " + 
                           periodo.getDays() + " dias.");
    }
}
