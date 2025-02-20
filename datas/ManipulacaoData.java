package datas;
import java.time.LocalDate;

public class ManipulacaoData {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate futuro = hoje.plusDays(10);
        LocalDate passado = hoje.minusMonths(3);
        LocalDate proximoAno = hoje.plusYears(1);

        System.out.println("Hoje: " + hoje);
        System.out.println("Daqui a 10 dias: " + futuro);
        System.out.println("Há 3 meses atrás: " + passado);
        System.out.println("No próximo ano: " + proximoAno);
    }
}
