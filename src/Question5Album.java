import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Question5Album {
    public static void main(String[] args) {
        LocalDate theJosuaTree = LocalDate.of(1987, 3, 9);
        LocalDate ahora = LocalDate.now();
        LocalDate RattleandHum = LocalDate.of(1988, 10, 10);


        Period tiempoAhora = Period.between(theJosuaTree, ahora);

        Period tiempoAlbums = Period.between(theJosuaTree, RattleandHum);

        int ahoraDias = tiempoAhora.getDays();
        int ahoraMeses = tiempoAhora.getMonths();
        int ahoraAnos = tiempoAhora.getYears();

        int albumsDias = tiempoAlbums.getDays();
        int albumMeses = tiempoAlbums.getMonths();
        int albumAnos = tiempoAlbums.getYears();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        LocalDate RattleandHumExact = RattleandHum.plusYears(albumAnos).plusMonths(albumMeses).plusDays(albumsDias);

        String formattedDate = RattleandHumExact.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));


        System.out.println("Time between the released of The Joshua Tree and Now " + ahoraDias + " days " + ahoraMeses + " months  " + ahoraAnos + " years");

        System.out.println("Time between the released of The Joshua Tree and the Released of Rattle and Hum " + albumsDias + " days " + albumMeses + " months  " + albumAnos + " years");
        System.out.println("Following album was relased in " + formattedDate);


    }
}
