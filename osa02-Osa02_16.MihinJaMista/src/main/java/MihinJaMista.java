
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.println("Mihin asti?");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien");
        int alku = Integer.valueOf(lukija.nextLine());
        while (alku <= luku) {
            System.out.println(alku);
            alku ++;
        }
    }
}
