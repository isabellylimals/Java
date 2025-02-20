package datas;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataHora {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatoUs = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Formato Brasileiro: " + agora.format(formatoBr));
        System.out.println("Formato Americano: " + agora.format(formatoUs));
    }
}

