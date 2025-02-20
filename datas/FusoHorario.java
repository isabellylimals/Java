package datas;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FusoHorario {
    public static void main(String[] args) {
        ZonedDateTime horaBrasil = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime horaNovaYork = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Hora São Paulo: " + horaBrasil);
        System.out.println("Hora Nova York: " + horaNovaYork);
    }
}
