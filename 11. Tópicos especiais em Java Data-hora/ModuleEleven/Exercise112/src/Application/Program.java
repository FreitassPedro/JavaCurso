package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:3026Z");
        System.out.print(d06);


    }
}
